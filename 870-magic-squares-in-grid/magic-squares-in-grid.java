class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagic(int[][] grid, int row, int col) {
        // Check if all numbers are between 1 and 9
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[row + i][col + j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        // Check row, column, and diagonal sums
        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (grid[row + i][col] + grid[row + i][col + 1] + grid[row + i][col + 2] != sum) return false;
            // Check columns
            if (grid[row][col + i] + grid[row + 1][col + i] + grid[row + 2][col + i] != sum) return false;
        }
        // Check diagonals
        if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != sum) return false;
        if (grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] != sum) return false;

        return true;
    }
}