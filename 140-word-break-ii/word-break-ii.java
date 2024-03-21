class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
    
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, 0, new ArrayList<>(), result);
        return result;
    }
     public static void backtrack(String s, List<String> wordDict, int index, List<String> current, List<String> result) {
        if (index == s.length()) {
            result.add(String.join(" ", current));
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            String word = s.substring(index, i);
            if (wordDict.contains(word)) {
                current.add(word);
                backtrack(s, wordDict, i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}