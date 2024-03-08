class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) == 1:
            return s

        max_palindrome = s[0]
        for j in reversed(range(len(s))):
            for i in range(len(s)):
                print(f"i: [{i}] and j: [{j}]")
                window_length = j + 1 - i 
                for k in range(len(s)):
                    start, end = 0 + k, window_length + k
                    #print("Candidate to check: " + s[start:end])
                    if not end <= len(s):
                        continue
                    
                    if isPalindrome(s[start:end]):
                        return s[start:end]
        #for j in range(len(s)):
        #    for i in range(len(s)):
        #        candidate = s[i:len(s)-j]
        #        if isPalindrome(candidate):
        #            max_palindrome = candidate if len(candidate) > len(max_palindrome) else max_palindrome
        return max_palindrome


def isPalindrome(candidate):
    if len(candidate) <= 1:
        return True
    return candidate[0] == candidate[len(candidate)-1] and isPalindrome(candidate[1:len(candidate)-1])