class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int rep = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            int c = 0; 
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    c++;
                }
            }
            if (c > rep && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}
