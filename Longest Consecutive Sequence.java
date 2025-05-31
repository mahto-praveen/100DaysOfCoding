class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int streak = 1;

                for (int current = num + 1; numSet.contains(current); current++) {
                    streak++;
                }

                longestStreak = Math.max(longestStreak, streak);
            }
        }

        return longestStreak;
    }
}
