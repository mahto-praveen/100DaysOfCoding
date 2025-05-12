class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int[] map = new int[10];
        for (int dig : digits){
            map[dig]++;
        }
        for (int num = 100; num < 999; num++){
            if (num % 2 != 0)
                continue;
            int[] freq = new int[10];
            int temp = num;
            while (temp > 0){
                freq[temp % 10]++;
                temp /= 10;
            }
            temp = num;
            boolean found = true;
            while (temp > 0){
                if (freq[temp % 10] > map[temp % 10]) {
                    found = false;
                    break;
                }
                temp /= 10;
            }
            if (found)
                res.add(num);
        }
        int[] ans = new int[res.size()];
        int k = 0;
        for (int num : res){
            ans[k++] = num;
        }
        return ans;
    }
}
