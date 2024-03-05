class Solution {
    public boolean isPalindrome(int x) {
        return isPalindromeCheck(String.valueOf(x));
    }

    private boolean isPalindromeCheck(String candidate) {
        var length = candidate.length();
        if (length <= 1) {
            return true;
        }
        else {
            var firstLetter = candidate.charAt(0);
            var lastLetter = candidate.charAt(length-1);
            if (firstLetter != lastLetter) 
                return false;
            
            //var innerWord = (length > 2) ? candidate.substring(1, length - 1) : "";
            return isPalindromeCheck(candidate.substring(1, length - 1));
        }
    }
}