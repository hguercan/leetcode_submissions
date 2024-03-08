import "fmt"

func maxFrequencyElements(nums []int) int {
    if len(nums) == 1 {
        return 1
    }

    var maxFrequency int = 1
    frequencyDict := make(map[int]int)
    for _, num := range nums {
        incrementedFrequency := frequencyDict[num] + 1
        frequencyDict[num] = incrementedFrequency
        if incrementedFrequency > maxFrequency {
            maxFrequency = incrementedFrequency
        }
    }

    var totalElements = 0
    for _, frequency := range frequencyDict {
        if frequency == maxFrequency {
            totalElements += frequency
        }
    }
    return totalElements
}