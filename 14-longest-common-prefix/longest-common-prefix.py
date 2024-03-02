class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:        
        shortest_word = min(strs, key=len)
        prefix = ""
        for j in range(1, len(shortest_word)+1):
            candidate = shortest_word[0:j]
            prefix = candidate if all(word.startswith(candidate) for word in strs) else prefix
        return prefix