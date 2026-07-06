class Solution {
    public int countSymmetricIntegers(int low, int high) {
         int count = 0;
        for (int i = low; i <= high; i++) 
        {
            String s = String.valueOf(i);
            if (s.length() % 2 != 0) 
            {
                continue;
            }
            int firstHalf = 0;
            int secondHalf = 0;
            int mid = s.length() / 2;
            for (int j = 0; j < mid; j++) 
            {
                firstHalf += s.charAt(j) - '0';
            }
            for (int j = mid; j < s.length(); j++) 
            {
                secondHalf += s.charAt(j) - '0';
            }
            if (firstHalf == secondHalf) 
            {
                count++;
            }
        }
        return count;
    }
}