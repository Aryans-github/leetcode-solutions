class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet<Integer> hs = new HashSet<>();
        for(int ele:nums1){
            hs.add(ele);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])) return nums2[i];
        }
        return -1;
    }
}