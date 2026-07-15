class Solution {

    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;
        for (int i = 1; i <= n; i++) {
            oddsum += (2 * i - 1);
            evensum += (2 * i);
        }
        return gcd(oddsum, evensum);
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
