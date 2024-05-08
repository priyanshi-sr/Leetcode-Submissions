class Solution {
    public String[] findRelativeRanks(int[] score) {
        return(Medals(score));
    }
      public static String[] Medals( int[] score) {
        int n = score.length;
        String[] res = new String[n];
        int[] sortedScores = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScores);
        for (int i = 0; i < score.length; i++) {
            int pos = Arrays.binarySearch(sortedScores, score[i]);
            pos = n - pos; //subtract pos from n to get the position of the score in descending order 
            if (pos == 1) {
                res[i] = "Gold Medal";
            } else if (pos == 2) {
                res[i] = "Silver Medal";
            } else if (pos == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = String.valueOf(pos);
            }
        }
        return res;
    }
}