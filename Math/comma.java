class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;
        long threshold = 1000; // Using long to prevent integer overflow during multiplication
        
        // Add the count of numbers that qualify for each comma threshold
        while (n >= threshold) {
            totalCommas += (n - threshold + 1);
            threshold *= 1000;
        }
        
        return totalCommas;
    }
}
