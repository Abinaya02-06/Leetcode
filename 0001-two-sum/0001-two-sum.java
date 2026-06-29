class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>Map=new HashMap();
        for(int i=0;i<=nums.length;i++)
        {
            int num=target-nums[i];
            if(Map.containsKey(num))
            {
                return new int[] {Map.get(num),i};
                    
            }
            Map.put(nums[i],i);
        }
        return new int[]{};
    }
}