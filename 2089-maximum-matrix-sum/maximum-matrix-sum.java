class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum=0;
        int minNegative=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<0) count++;
                if(Math.abs(matrix[i][j])<minNegative){
                    minNegative=Math.abs(matrix[i][j]);
                }
                totalSum+=Math.abs(matrix[i][j]);
                
            }
        }

        if(count%2==0) return totalSum;
        else{
            totalSum-=(2*minNegative);
            return totalSum;
        }
    }
}