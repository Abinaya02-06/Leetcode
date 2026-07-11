class Solution {
    public ArrayList<Integer>nextGreaterElement(int[]arr){
        ArrayList<Integer>l1=new ArrayList<>();
        Stack<Integer>s1=new Stack<>();
        int i,arrLength=arr.length;
        for(i=arrLength-1;i>=0;i--){
            while(!s1.isEmpty()&&arr[i]>=s1.peek()){
                s1.pop();
            }
                int topElement=s1.isEmpty()==true?-1:s1.peek();
                l1.add(topElement);
                s1.add(arr[i]);
        }
            Collections.reverse(l1);
            return l1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var arr=nextGreaterElement(nums2);
        int i,j,index=0;
        int[]ans=new int[nums1.length];
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                int number=arr.get(j);
                ans[index]=number;
                index++;
               } 
            }
        }
        return ans;
    }
}