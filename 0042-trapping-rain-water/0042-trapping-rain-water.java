class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int f[] = new int[n], l[] = new int[n];
        f[0] = height[0];
        for (int i = 1;i<n;i++)
        {
            f[i] = Math.max(f[i-1],height[i]);
        }
        l[n-1] = height[n-1];
        for(int i =n-2; i>=0;i--)
        {
            l[i] = Math.max(l[i+1],height[i]);
        }
        int c =0;
        for(int i =0;i<n;i++)
        {
            int a = Math.min(f[i],l[i])-height[i];
            if(a>0)
            {
                c+=a;
            }
        }
        return c;
    }
}