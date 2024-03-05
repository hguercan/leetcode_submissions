class Solution {
    public boolean isPalindrome(int x) {
        System.out.println(x);
        return isPalindromeCheck(String.valueOf(x));
    }

    private boolean isPalindromeCheck(String candidate) {
        if (candidate == null) {
            return false;
        } else if (candidate.length() <= 1) {
            return true;
        }
        else {
            var length = candidate.length();
            var firstLetter = candidate.charAt(0);
            var lastLetter = candidate.charAt(length-1);
            var innerWord = (length > 2) ? candidate.substring(1, length - 1) : "";
            System.out.println(String.format("innerWord: %s, firstChar: %c, lastChar: %c", innerWord, firstLetter, lastLetter) );
            return firstLetter != lastLetter ? false : isPalindromeCheck(innerWord);
        }
    }
}