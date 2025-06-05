class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutation(res,0,nums.length,nums);
        return res;
    }
    void permutation(List<List<Integer>> res,int fix,int n,int[] arr)
    {
        if (fix==n-1)
        {
            List<Integer> out  = new ArrayList<>();
            for(int i = 0;i<arr.length;i++)
            {
                out.add(arr[i]);
            }
            res.add(out);
            return;
        }
        for(int i=fix;i<n;i++)
        {
            swap(fix,i,arr);
            permutation(res,fix+1,n,arr);
            swap(fix,i,arr);
        }
    }
    void swap(int x,int y,int arr[])
    {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}