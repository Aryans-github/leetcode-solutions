class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        HashMap<Integer,Integer> hs = new HashMap<>();
        int value=1;
        for(int i=1;i<=arr.length;i++){
            if(!(hs.containsKey(arr[i-1]))){
                hs.put(arr[i-1],value);
                value++;
            }
            
        }
        for(int i=0;i<copy.length;i++){
            ans[i]=hs.get(copy[i]);
        }
        return ans;
    }
}