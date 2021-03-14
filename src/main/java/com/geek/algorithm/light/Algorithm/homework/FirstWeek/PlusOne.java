/**
 * 66. 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for(int i =length-1; i>=0; --i) {
            if (digits[i] > 8) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int n = length + 1;
        int[] arr = new int[n];
        arr[0] =1;
        for (int j = 1; j<=length; j++)
            arr[j] =0;
        return arr;
    }
}