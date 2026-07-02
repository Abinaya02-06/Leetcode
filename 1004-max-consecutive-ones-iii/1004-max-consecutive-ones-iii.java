class Solution
 {
    public int longestOnes(int[] nums, int k)
    {
        int numsLength=nums.length;
        int right =0,left=0,count=0,maxLen=0;
        while(right<numsLength)
        {
            
            if(nums[right]==0)
            {
                count++;
                while(left<=right && count>k)
                {
                     if(nums[left]==0)
                    {
                        count--;
                    }
                    left++;
                }
            
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}