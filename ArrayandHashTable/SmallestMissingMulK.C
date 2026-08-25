import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        
        int currentMultiple = k;
        while (uniqueNums.contains(currentMultiple)) {
            currentMultiple += k;
        }
        
        return currentMultiple;
    }
}
