class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])<minDiff){
                minDiff=arr[i+1]-arr[i];
            }
        }
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
                if((arr[i+1]-arr[i])==minDiff){
                    mainList.add(Arrays.asList(arr[i], arr[i + 1]));
                }
        }
        return mainList;
    }
}