// public class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         for (int i = 0; i < arr.length - 2; i++) {
//             if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
public class Solution{
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int num : arr) {
            count = (num % 2 != 0) ? count + 1 : 0;
            if (count == 3) return true;
        }
        return false;
    }
}
