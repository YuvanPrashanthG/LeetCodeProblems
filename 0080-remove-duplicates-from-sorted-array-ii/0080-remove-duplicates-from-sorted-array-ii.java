class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int t=0;
        for (int i=1;i<nums.length;i++)
        {
            if ( nums[i-1]!=nums[i])
            {
                t=0;
                nums[k++]=nums[i];
            }
            else
            {
                t++;
                if(t<=1)
                {
                    nums[k++]=nums[i];
                }
            }
        }
        return k;
    }
}