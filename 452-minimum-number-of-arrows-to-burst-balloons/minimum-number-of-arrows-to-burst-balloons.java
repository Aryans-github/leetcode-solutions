class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int start = points[0][0];
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=end){
                end=Math.min(end,points[i][1]);
            }
            else{
                result.add(new int[]{start, end});

                start = points[i][0];
                end = points[i][1];
            }
        }
        result.add(new int[]{start, end});

        return result.size();
    }
}