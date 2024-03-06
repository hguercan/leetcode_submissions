class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        indexes = self.find_indexes(number, digit)
        max_number = "0"
        for index in indexes:
            max_number = max(max_number, self.replace_digit(index, number))
        return max_number
        
    
    def find_indexes(self, number, digit):
        return [i for i, ltr in enumerate(number) if ltr == digit]
    
    def replace_digit(self, index, number):
        return number[:index] + number[index+1:]