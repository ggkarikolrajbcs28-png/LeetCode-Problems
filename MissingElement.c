public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int lowest = nums[0];
        int highest = nums[0];     
        for (int num : nums) {
            if (num < lowest)  lowest = num;
            if (num > highest) highest = num;
        }

        List<Integer> missingPieces = new ArrayList<>();
        for (int current = lowest; current <= highest; current++) {

            boolean iHaveIt = false;
            for (int num : nums) {
                if (num == current) {
                    iHaveIt = true;
                    break;
                }
            }

            if (!iHaveIt) {
                missingPieces.add(current);
            }
        }
        return missingPieces;
            
    }


}
