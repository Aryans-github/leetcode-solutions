class Solution {
    public int trap(int[] height) {
        int water = 0;
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < height.length; i++) {
            // While current height is greater than the height at the stack's top
            while (!stk.isEmpty() && height[i] > height[stk.peek()]) {
                int poppedIndex = stk.pop();
                
                if (stk.isEmpty()) break; // No left wall to trap water

                int distance = i - stk.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stk.peek()]) - height[poppedIndex];
                water += distance * boundedHeight;
            }
            stk.push(i);
        }
        return water;
    }
}



// class Solution {
//     public int trap(int[] height) {
//         int water = 0;
//         Stack<Integer> stk = new Stack<>();
//         for (int i = 0; i < height.length; i++) {
//             if (stk.isEmpty()) {
//                 stk.push(i);
//             } else {
//                 if ((!stk.isEmpty()) && stk.peek() >= height[i]) {
//                     stk.push(i);
//                 } else if ((!stk.isEmpty()) && stk.peek() < height[i]) {
//                     while (!stk.isEmpty() && height[i] > height[stk.peek()]) {
//                         int popped = stk.pop();

//                         if (stk.isEmpty()) {
//                             break; // No left boundary
//                         }

//                         int distance = i - stk.peek() - 1;
//                         int minHeight = Math.min(height[stk.peek()], height[i]);
//                         water += distance * (minHeight - height[popped]);
//                     }

//                 }
//                 stk.push(i);
//             }
//         }
//         return water;
//     }
// }