class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int m = 1;
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                c++;
            } else {
                c = 1;
            }
            if (c <= 2) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
