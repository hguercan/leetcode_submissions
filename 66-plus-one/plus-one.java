class Solution {
    public int[] plusOne(int[] digits) {
        var lastIndex = digits.length - 1;
        var lastValue = digits[lastIndex];
        return incrementDigit(digits, lastValue, lastIndex);
    }

    private int[] incrementDigit(int[] digits, int digit, int currIndex) {
        var incrementedValue = digit + 1;
        if(incrementedValue >= 10) {
                digits[currIndex] = incrementedValue % 10;
                var nextIndex = currIndex - 1;
                if(nextIndex == -1) {
                    System.out.println(String.format("New Digits Length: %d", digits.length+1));
                    int[] newDigits = new int[digits.length+1];
                    for(int i=0; i < digits.length; i++) {
                        System.out.println(String.format("Iteration i: %d", i+1));
                        System.out.println(Arrays.toString(digits));
                        newDigits[i+1] = digits[i];
                    }
                    digits = newDigits;
                    nextIndex = 0;
                }
                return incrementDigit(digits, digits[nextIndex], nextIndex);
        } else {
            digits[currIndex] = incrementedValue;
        }
        return digits;
    }
}