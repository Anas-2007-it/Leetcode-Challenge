class Solution(object):
    def isPrefixString(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: bool
        """
        if len(s) < len(words[0]):
            return False
        i = 0
        ptr = 0
        j = 0
        while i < len(s) and j < len(words):
            length = len(words[j])
            if s[i : length + i] != words[j]:
                return False
            i += length
            j += 1
            if i == len(s):
                return True
        return False
        