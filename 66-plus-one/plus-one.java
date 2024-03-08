class Solution {
    public int[] plusOne(int[] digits) {
        var lastIndex = digits.length - 1;
        return incrementDigit(digits, digits[lastIndex], lastIndex);
    }

    private int[] incrementDigit(int[] digits, int digit, int currIndex) {
        var incrementedValue = digit + 1;
        if(incrementedValue >= 10) {
                digits[currIndex] = incrementedValue % 10;
                var nextIndex = currIndex - 1;
                if(nextIndex == -1) {
                    int[] newDigits = new int[digits.length+1];
                    for(int i=0; i < digits.length; i++) {
                        newDigits[i+1] = digits[i];
                    }
                    digits = newDigits;
                    nextIndex = 0;
                }
                digits = incrementDigit(digits, digits[nextIndex], nextIndex);
        } else {
            digits[currIndex] = incrementedValue;
        }
        return digits;
    }
}