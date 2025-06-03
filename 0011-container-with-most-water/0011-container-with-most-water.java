class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max = 0,width,ht;
        {
            while(i<j)
            {
                width = j-i;
                if (height[i]<height[j])
                {
                    max = Math.max(max,height[i]*width);
                    i++;
                }
                else
                {
                     max = Math.max(max,height[j]*width);
                     j--;
                }
            }
        }
        return max;
    }
}