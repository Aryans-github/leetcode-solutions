class Solution {
    public int numOfWays(int n) {
        int MOD = 1_000_000_007;

        // There are two patterns: "ABA" and "ABC"
        long aba = 6; // Patterns like RYR, YRY, etc.
        long abc = 6; // Patterns like RYG, YGR, etc.

        for (int i = 2; i <= n; i++) {
            // Calculate the new patterns for the next row
            long newAba = (3 * aba + 2 * abc) % MOD;
            long newAbc = (2 * aba + 2 * abc) % MOD;

            // Update the patterns
            aba = newAba;
            abc = newAbc;
        }

        return (int)((aba + abc) % MOD);
    }
}