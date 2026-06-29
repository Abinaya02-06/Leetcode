class Solution {
    public int countDigits(int n) {
        int count=0;
        int div=1;
        while(div<=n)
        {
            int ans=(n%(div*10))/div;
            if(n%ans==0)
            count++;
            div=div*10;
        }
        return count;
    }
}