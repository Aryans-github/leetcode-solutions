class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack stk = new Stack<>();
        // int[] ans = new int[num2.length];
        // for(int i=nums2.length;i>=0;i++){
        //     if(stk.isEmpty()){
        //         stk.push(nums[i]);
        //         ans[i]=-1;
        //     }
        //     else if(stk.top()<=nums2[i]){
        //         while(stk.top()<=nums2[i]){
        //             stk.pop();
        //         }
        //         ans[i]=stk.top();
        //     }
        //     else if(stk.top()>nums2[i]){
        //         stk.push(nums2[i]);
        //     }
        // }
        // return ans;
        Stack<Integer> stk = new Stack();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (stk.isEmpty()) {
                stk.push(nums2[i]);
                hs.put(nums2[i], -1);
            } else {
                if (nums2[i] > stk.peek()) {
                    while (!stk.isEmpty() && nums2[i] > stk.peek()) {
                        int pop = stk.pop();
                        hs.put(pop, nums2[i]);
                    }

                }
                stk.push(nums2[i]);

            }
        }
        while (!stk.isEmpty()) {
            hs.put(stk.pop(), -1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hs.get(nums1[i]);
        }
        return ans;
    }
}