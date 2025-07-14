class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm2 =  new HashMap<>();
        HashMap<Character,Integer> hm1 =  new HashMap<>();
        for(char i : ransomNote.toCharArray())
        {
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(char i : magazine.toCharArray())
        {
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        for(char key : hm1.keySet())
        {
            if(!hm2.containsKey(key)||hm2.get(key)<hm1.get(key))
            {
                return false;
            }
        }
        return true;
    }
}