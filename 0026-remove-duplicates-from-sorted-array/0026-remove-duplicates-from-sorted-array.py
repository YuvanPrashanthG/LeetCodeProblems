class Solution(object):
    def removeDuplicates(self, nums):
        index =0
        for i in range(1,len(nums)):
            if (nums[i]!=nums[i-1]):
                index +=1
                nums[index] = nums[i]
                
        return index+1
        
        