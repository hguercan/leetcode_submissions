class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:        
        word = min(strs, key=len)
        prefix = ""
        for j in range(1, len(word)+1):
            candidate = word[0:j]
            prefix = candidate if all(word.startswith(candidate) for word in strs) else prefix
        return prefix

        
