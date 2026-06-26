class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0 && nums2.length==0) return;
        if(nums1.length==1 && nums2.length==0) return;
        if(nums1.length==0 && nums2.length==1){
            nums1[0]=nums2[0];
        }
        int p=0,q=0;
        int[] ans = new int[m+n];
        for(int i=0;i<m+n;i++){
            if(p<m && q<n){
                if(nums1[p]<=nums2[q]){
                    ans[i]=nums1[p];
                    p++;
                }
                else if(nums1[p]>nums2[q]){
                    ans[i]=nums2[q];
                    q++;
                }
            }
            else{
                if(p==m){
                    ans[i]=nums2[q];
                    q++;
                }
                else{
                    ans[i]=nums1[p];
                    p++;
                }
            }

        }
        for(int i=0;i<m+n;i++){
            nums1[i]=ans[i];
        }
        return;
    }
}
