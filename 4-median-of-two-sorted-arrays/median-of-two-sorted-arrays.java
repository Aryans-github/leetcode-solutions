class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;

        // merge both arrays
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        // remaining elements of nums1
        while (i < n) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        // remaining elements of nums2
        while (j < m) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int len = n + m;

   
        if (len % 2 == 0) {
            return (arr[len / 2] + arr[(len / 2) - 1]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }
}
