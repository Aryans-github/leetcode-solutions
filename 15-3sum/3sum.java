class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();
        for (int p1 = 0; p1 < nums.length - 2; p1++) {
            if (p1 > 0 && nums[p1] == nums[p1 - 1]) continue;
            int p2 = p1 + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {

                if (nums[p1] + nums[p2] + nums[p3] == 0) {
                    ls.add(new ArrayList<>(List.of(nums[p1], nums[p2], nums[p3])));
                    while (p2 < p3 && nums[p2] == nums[p2+1])
                        p2++;
                    while (p2 < p3 && nums[p3] == nums[p3-1])
                        p3--;

                    p2++;
                    p3--;
                }
                else if(nums[p1] + nums[p2] + nums[p3]<0) p2++;
                else p3--;
            }

        }
        return ls;
    }
}