import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] finalAns=new int[2];
        int i;
        HashMap<Integer,Integer>h1=new HashMap();
        for(i=0;i<=nums.length;i++)   //0(N)
        {
            int diff=target-nums[i];
            var value=h1.get(diff);
            if(value!=null)
            {
                finalAns[0]=value;
                finalAns[1]=i;
                return finalAns;      
            }
            h1.put(nums[i],i);
        }
        return finalAns;
    }
}