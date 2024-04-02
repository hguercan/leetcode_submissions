class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        count_mappings = len(set(zip(s,t)))
        len_letters_in_s = len(set(s))
        len_letters_in_t = len(set(t))
        return len(s) == len(t) and count_mappings == len_letters_in_s == len_letters_in_t