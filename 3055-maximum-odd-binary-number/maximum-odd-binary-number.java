class Solution {
    public String maximumOddBinaryNumber(String s) {
        var countOnes = (int) s.chars().filter(ch -> ch == '1').count();
        return "1".repeat(countOnes - 1) + "0".repeat(s.length() - (countOnes - 1) - 1) + "1";
    }
}