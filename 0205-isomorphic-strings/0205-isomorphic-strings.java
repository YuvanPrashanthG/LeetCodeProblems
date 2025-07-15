class Solution {
    public boolean isIsomorphic(String s, String t) {
       
        if (s.length()<=1)
        {
            return true;
        }
        HashMap<Character,Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<Character>();
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        hm.put(arr1[0],arr2[0]);
        hs.add(arr2[0]);
        for(int i =1 ;i<s.length();i++)
        {
            if(hm.containsKey(arr1[i]))
            {
                if(hm.get(arr1[i])!=arr2[i])
                {
                    return false;
                }
            }
            else
            {
                if(hs.contains(arr2[i]))
                {
                    return false;
                }
                hm.put(arr1[i],arr2[i]);
                hs.add(arr2[i]);
            }
        }
        return true;
    }
}