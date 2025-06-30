class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> fm = new HashMap<>();

        for(int n : nums)
        {
            fm.put(n,fm.getOrDefault(n,0)+1);
        }
        int max = 0;
        for(int n : fm.keySet())
        {
            if(fm.containsKey(n+1))
            {
                int curr = fm.get(n) +  fm.get(n+1);
                max = Math.max(max,curr);
            }
        }
        return max;
    }
}
