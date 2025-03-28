class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int sum = nums[0];
        int total = 0;

        for(int n:nums)
        {
            if(total < 0)
            {
                total = 0;
            }
           
                total+=n;
                sum = Math.max(total,sum);
        }
        return sum;
    }
}
