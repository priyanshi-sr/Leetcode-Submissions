class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }
        if (i < word1.length()) {
            merged.append(word1.substring(i));
        } else if (i < word2.length()) {
            merged.append(word2.substring(i));
        }

        return merged.toString();
    }
}