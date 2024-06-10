class Solution {
    public int heightChecker(int[] heights) {
        return(Checker(heights));
    }
    public static  int Checker(int[] heights) {
         int n = heights.length;
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int mismatchCount = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }

        return mismatchCount;
    }
}