class Solution {
    public int hIndex(int[] citations) {
        int arr[] = new int[citations.length+1];
        for (int citation : citations) {
            arr[Math.min(citation, citations.length)]++;
        }
        int cur = 0;      
        for(int i = citations.length;i>=0;i--)
        {
            cur += arr[i];
            if (i <= cur)
            {
                return i;
            }

        }
        return 0; 
    }
}