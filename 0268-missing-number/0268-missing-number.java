class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,sum=0;
        int t=(n*(n+1))/2;
        for (int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return t-sum;
    }
}