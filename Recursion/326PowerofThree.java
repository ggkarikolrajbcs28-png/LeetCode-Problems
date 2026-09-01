class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        
        long nm = 3; 
        for (int i = 1; i <= 19; i++) { 
            if (nm == n) {
                return true;
            }
            nm *= 3; 
        }
        
        return false;
    }
}
