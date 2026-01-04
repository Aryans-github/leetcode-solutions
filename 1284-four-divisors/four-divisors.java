class Solution {
    public int sumFourDivisors(int[] nums) {

        int globalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0, sum = 0;
            for (int j = 1; (j * j <= nums[i]); j++) {
                if (nums[i] % j == 0) {
                    if (j * j == nums[i]) {
                        count++;
                        sum += j;
                    } else {
                        count += 2;
                        sum += j + (nums[i] / j);
                    }
                }
                if (count > 4)
                break;
            }
            
            if (count == 4) {
                globalSum += sum;
            }
        }

        return globalSum;
    }
}