class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        // Start from the rightmost bit and work towards the left
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '1') {
                // When there's a '1', it becomes '0' with a carry
                steps += 2 - carry; // 1 step for +1, 1 step for division
                carry = 1; // Set carry
            } else {
                // When there's a '0', just divide by 2
                steps += 1 + carry; // 1 step for division, carry adds no extra steps
            }
        }

        // Deal with the first bit
        return steps + carry;
    }
}