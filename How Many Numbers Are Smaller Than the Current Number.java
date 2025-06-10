class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] n = nums.clone();
        Arrays.sort(n);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(!map.containsKey(n[i]))
                map.put(n[i],i);
        }
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length ; i++)
        {
            res[i] = map.get(nums[i]);
        }

        return res;
        
    }
}
