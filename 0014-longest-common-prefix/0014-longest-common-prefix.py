class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        out =""
        st = sorted(strs)
        st1 = st[0]
        st2 = st[-1]
        for i in range(len(st1)):
            if(st1[i]==st2[i]):
                out = out + st1[i]
            else:
                break
        return out