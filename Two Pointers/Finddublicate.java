class Solution {
    public int findDuplicate(int[] nums) {
        int c = nums[0];
        int r = nums[0];
        int n = nums.length;
        
        do {
            c = nums[c];
            r = nums[nums[r]];
        } while (c != r);
        
        c = nums[0];
        while (c != r) {
            c = nums[c];
            r = nums[r];
        }
        
        return c;
    }
}
