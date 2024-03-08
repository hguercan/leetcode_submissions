import "fmt"

func maxFrequencyElements(nums []int) int {
    if len(nums) == 1 {
        return 1
    }

    frequencyDict := make(map[int]int)
    for _, num := range nums {
        frequencyDict[num] = frequencyDict[num] + 1
    }
    return countElementsWithMaxFrequency(frequencyDict)
}

func countElementsWithMaxFrequency(frequencyDict map[int]int) int {
    var maxFrequency int = 1
    for _, frequency := range frequencyDict {
        if frequency > maxFrequency {
            maxFrequency = frequency
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