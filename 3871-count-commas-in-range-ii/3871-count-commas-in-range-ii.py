class Solution(object):
    def countCommas(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        count = 0
        i= 1000
        while i <= n:
            count += n - i + 1 # number of numbers with commas
            i *= 1000

        return count
        