class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        
        long nm = 4; 
        for (int i = 1; i <= 19; i++) { 
            if (nm == n) {
                return true;
            }
            nm *= 4; 
        }
        
        return false;
    }
}
