import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
      int i,j,k;
      List<List<Integer>>finalAns=new ArrayList<>();
      HashSet<List<Integer>>h1=new HashSet<>();
      Arrays.sort(nums);//o(nlogn)

      for(i=0;i<nums.length-1;i++)//o(n)
      {
        int start=i+1;
        int end=nums.length-1;
        while(start<end)
        {
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0)
                {
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[start]);
                    l1.add(nums[end]);
                    h1.add(l1);
                    start++;
                    end--;
                }
                else if(sum<0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }


    for(var it:h1)//o(n)    tc:o(n4)  sc;O(n*m)
    {
      finalAns.add(it);
    }
    return finalAns;
}
}
