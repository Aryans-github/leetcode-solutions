class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else
                i++;
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int ele : nums) {
            hs.put(ele, hs.getOrDefault(ele, 0) + 1);
        }
        List<Integer> ls = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            {
                if (!hs.containsKey(j+1))
                    ls.add(j+1);
            }
        }
        return ls;
    }

    void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}