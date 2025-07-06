class Solution {
    public String reverseWords(String s) {
        String strings[] = s.split(" ");
        String str = strings[strings.length-1].trim();
        for (int i =strings.length-2;i>=0;i--)
        {
            str = str.trim()+" "+ strings[i].trim();
        }
        return str.trim();
    }
}