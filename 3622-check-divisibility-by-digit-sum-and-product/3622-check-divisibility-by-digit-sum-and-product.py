class Solution(object):
    def checkDivisibility(self, n):
        org=n
        dsum=0
        pro=1
        while n!=0:
            digit=n%10
            dsum+=digit
            pro*=digit
            n//=10
        return org%(dsum+pro)==0   
        