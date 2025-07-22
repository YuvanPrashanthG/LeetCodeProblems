class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0

        left = 1
        right =x
        ans = 0
        while(left<=right):
            mid = left+(right-left)//2
            sqr = mid*mid
            if sqr == x:
                return mid
            elif sqr < x:
                ans = mid
                left = mid + 1
            else:
                right = mid - 1
        return ans
