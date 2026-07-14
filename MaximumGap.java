import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int maxdiff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int currentdiff = nums[i + 1] - nums[i];
            if (currentdiff > maxdiff) {
                maxdiff = currentdiff;
            }
        }
        
        return maxdiff;
    }
}
