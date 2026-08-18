class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == n) {
            int maxVal = nums[0];
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }

        int[] counts = new int[51];
        for (int num : nums) {
            counts[num]++;
        }

        if (k == 1) {
            int ans = -1;
            for (int i = 0; i <= 50; i++) {
                if (counts[i] == 1) {
                    ans = Math.max(ans, i);
                }
            }
            return ans;
        }

        int ans = -1;
        if (counts[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (counts[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}

