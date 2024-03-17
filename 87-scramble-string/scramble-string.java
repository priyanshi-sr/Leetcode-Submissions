class Solution {
    public boolean isScramble(String s1, String s2) {
      return(Scramble(s1,s2));
    }
     public static boolean Scramble(String s1, String s2) {
          Map<String, Boolean> memo = new HashMap<>();
        return scrambleHelper(s1, s2, memo);
    }

    public static boolean scrambleHelper(String s1, String s2, Map<String, Boolean> memo) {
        // Check if the strings are equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        // Check if the strings are not of the same length, return false
        if (s1.length() != s2.length()) {
            return false;
        }

        // Check if the subproblem has already been solved, return the result from memo
        String key = s1 + ":" + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int n = s1.length();
        // Try all possible splits of the strings
        for (int i = 1; i < n; i++) {
            // Case 1: Check if the strings are scrambled with the same split
            if ((scrambleHelper(s1.substring(0, i), s2.substring(0, i), memo) &&
                    scrambleHelper(s1.substring(i), s2.substring(i), memo)) ||
                    // Case 2: Check if the strings are scrambled with opposite splits
                    (scrambleHelper(s1.substring(0, i), s2.substring(n - i), memo) &&
                            scrambleHelper(s1.substring(i), s2.substring(0, n - i), memo))) {
                // Store the result of the subproblem in memo
                memo.put(key, true);
                return true;
            }
        }

        // Store the result of the subproblem in memo
        memo.put(key, false);
        return false;
    }
    
}