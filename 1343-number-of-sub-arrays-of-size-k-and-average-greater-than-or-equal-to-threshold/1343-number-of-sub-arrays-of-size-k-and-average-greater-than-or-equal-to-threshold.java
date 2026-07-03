class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int targetSum=k*threshold;
        int count=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        if(sum>=targetSum)
        {
            count++;
        }
        for(int i=k;i<arr.length;i++)
        {
            sum=sum+arr[i];
            sum=sum-arr[i-k];
        if(sum>=targetSum)
        {
            count++;
        }
        }
        return count;
    }
}