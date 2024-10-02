import java.util.*;

class Solution {
    public long validSubstringCount(String word1, String word2) {
        long res = 0;
        int[][] mpp = new int[26][2]; // To store frequencies of both words
        int l = 0, r = 0;
        int n = word1.length();
        int m = word2.length();
        int size = 0;
        
        // Count frequency of characters in word2
        for (char ch : word2.toCharArray()) {
            mpp[ch - 'a'][1]++;
        }
        
        while (r < n) {
            // Slide the window while it contains all characters of word2
            while (size == m && l <= r) {
                res += (n - r + 1);
                mpp[word1.charAt(l) - 'a'][0]--;
                if (mpp[word1.charAt(l) - 'a'][1] > 0 && mpp[word1.charAt(l) - 'a'][0] < mpp[word1.charAt(l) - 'a'][1]) {
                    size--;
                }
                l++;
            }
            // Expand the window
            if (mpp[word1.charAt(r) - 'a'][1] > 0 && mpp[word1.charAt(r) - 'a'][0] < mpp[word1.charAt(r) - 'a'][1]) {
                size++;
            }
            mpp[word1.charAt(r) - 'a'][0]++;
            r++;
        }
        
        // Handle remaining valid substrings
        while (size == m && l <= r) {
            res += (n - r + 1);
            mpp[word1.charAt(l) - 'a'][0]--;
            if (mpp[word1.charAt(l) - 'a'][1] > 0 && mpp[word1.charAt(l) - 'a'][0] < mpp[word1.charAt(l) - 'a'][1]) {
                size--;
            }
            l++;
        }
        
        return res;
    }
}