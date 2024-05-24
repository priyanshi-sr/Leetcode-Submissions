class Solution {

     private int backtracking(String[] words, int[] count,
            int[] score, int idx) {
        int maxi = 0;
        for (int i = idx; i < words.length; i++) {
            int res = 0;
            boolean isValid = true;
            for (char ch : words[i].toCharArray()) {
                count[ch - 'a']--;
                res += score[ch - 'a'];
                if (count[ch - 'a'] < 0) {
                    isValid = false;
                }
            }

            if (isValid) {
                res += backtracking(words, count, score, i + 1);
                maxi = Math.max(maxi, res);
            }

            // Backtracking...
            // Making things as it is as it was before calculating it
            for (char ch : words[i].toCharArray()) {
                count[ch - 'a']++;
                res = 0;
            }
        }
        return maxi;
    }

    // Drive Function
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // base Case
        if (words == null || words.length == 0 || letters == null
                || letters.length == 0 || score == null
                || score.length == 0) {
            return 0;
        }

        int[] count = new int[score.length];
        for (char ch : letters) {
            count[ch - 'a']++;
        }

        return backtracking(words, count, score, 0);
    }
}