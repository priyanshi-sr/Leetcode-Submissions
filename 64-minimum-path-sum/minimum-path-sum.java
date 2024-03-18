class Solution {
    public int minPathSum(int[][] arr) {
        return(Minimum(arr));
    }
     public static int Minimum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    arr[i][j] += Math.min(arr[i - 1][j], arr[i][j - 1]);
                } else if (i > 0) {
                    arr[i][j] += arr[i - 1][j];
                } else if (j > 0) {
                    arr[i][j] += arr[i][j - 1];
                }
            }
        }
        return arr[m - 1][n - 1];
    }
}