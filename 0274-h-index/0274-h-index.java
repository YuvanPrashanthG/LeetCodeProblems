class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort in ascending order
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // Number of papers with citations >= citations[i]
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0; 
    }
}