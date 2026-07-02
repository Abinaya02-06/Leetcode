import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j;
        int maxLen=0;
        for(i=0;i<s.length();i++)
        {
            HashMap<Character,Integer>h1=new HashMap<>();
            for(j=i;j<s.length();j++)
            {
                var it=h1.get(s.charAt(j));
                if(it!=null)
                {
                    break;
                }
            h1.put(s.charAt(j),1);
            maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}