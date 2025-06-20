class Solution {
    public int[] plusOne(int[] digits) {
       int last = digits.length;
       for(int i = last-1 ; i>=0 ; i--)
       {
        if(digits[i]<9)
        {
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }
      int[] newN = new int[last+1];
      newN[0] = 1;
      return newN;
    }
}
