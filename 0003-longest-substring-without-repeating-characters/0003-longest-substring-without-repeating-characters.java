import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int maxLen=0;
            HashMap<Character,Integer>h1=new HashMap<>();
            while(right<s.length())
            {
                while(left<right && h1.containsKey(s.charAt(right))==true)
                {
                    h1.remove(s.charAt(left));
                    left++;
                }
            maxLen=Math.max(maxLen,right-left+1);
            h1.put(s.charAt(right),1);
            right++;
            }
        return maxLen;
    }
}