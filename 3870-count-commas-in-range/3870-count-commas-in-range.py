class Solution(object):
    def countCommas(self, n):
        """
        :type n: int
        :rtype: int
        """
        count=0
        for i in range(1,n+1):
            digit=len(str(i))
            if digit>=4:
                count+=(digit-1)//3 # Imp formula ---> d=4  d-1//3=1 (1000)--> 1 comma
        return count
              
        