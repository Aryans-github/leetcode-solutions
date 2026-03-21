class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int num : nums) {
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if ((hs.get(nums[i]) == 1) && nums[i] % 2 == 0) {
                return nums[i];
            }
        }
        return -1;
    }
}