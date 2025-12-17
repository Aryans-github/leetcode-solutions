class Solution {
    public int search(int[] nums, int target) {

                int low = 0, high = nums.length - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (nums[mid] == target) {
                        return mid; // Target found
                    }

                    // Check if the left half is sorted
                    if (nums[low] <= nums[mid]) {
                        if (target >= nums[low] && target < nums[mid]) {
                            high = mid - 1; // Target in left half
                        } else {
                            low = mid + 1; // Target in right half
                        }
                    }
                    // Otherwise, the right half is sorted
                    else {
                        if (target > nums[mid] && target <= nums[high]) {
                            low = mid + 1; // Target in right half
                        } else {
                            high = mid - 1; // Target in left half
                        }
                    }
                }

                return -1; // Target not found
        
        //     int low = 0;
        //     int high = nums.length - 1;
        //     int mid = low + (high - low) / 2;
        //     if (nums[low] <= nums[mid]) {
        //         if (target >= nums[low] && target <= nums[mid]) {
        //             int innerLow = 0;
        //             int innerHigh = mid;
        //             while (innerLow <= innerHigh) {
        //                 int innerMid = (innerLow + innerHigh) / 2;
        //                 if (target == nums[innerMid]) {
        //                     return innerMid;
        //                 } else if (target < nums[innerMid]) {
        //                     innerHigh = innerMid - 1;
        //                 } else {
        //                     innerLow = innerMid + 1;
        //                 }
        //             }

        //         }
        //         else{
        //             int innerLow = mid+1;
        //             int innerHigh = nums.length-1;
        //             while (innerLow <= innerHigh) {
        //                 int innerMid = (innerLow + innerHigh) / 2;
        //                 if (target == nums[innerMid]) {
        //                     return innerMid;
        //                 } else if (target < nums[innerMid]) {
        //                     innerHigh = innerMid - 1;
        //                 } else {
        //                     innerLow = innerMid + 1;
        //                 }
        //             }
        //         }
        //     } else {
        //         if (target >= nums[mid] && target <= nums[high]) {
        //             int innerLow = mid;
        //             int innerHigh = nums.length - 1;
        //             while (innerLow <= innerHigh) {
        //                 int innerMid = (innerLow + innerHigh) / 2;
        //                 if (target == nums[innerMid]) {
        //                     return innerMid;
        //                 } else if (target < nums[innerMid]) {
        //                     innerHigh = innerMid - 1;
        //                 } else {
        //                     innerLow = innerMid + 1;
        //                 }
        //             }

        //         }
        //         else{
        //             int innerLow = 0;
        //             int innerHigh = mid-1;
        //             while (innerLow <= innerHigh) {
        //                 int innerMid = (innerLow + innerHigh) / 2;
        //                 if (target == nums[innerMid]) {
        //                     return innerMid;
        //                 } else if (target < nums[innerMid]) {
        //                     innerHigh = innerMid - 1;
        //                 } else {
        //                     innerLow = innerMid + 1;
        //                 }
        //             }
        //         }
        //     }
        //     return -1;
    }
}