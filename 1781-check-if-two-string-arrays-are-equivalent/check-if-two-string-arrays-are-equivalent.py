class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        """
        :type word1: List[str]
        :type word2: List[str]
        :rtype: bool
        """
        joined_word_one = "".join(word1)
        joined_word_two = "".join(word2)
        return joined_word_one == joined_word_two
        