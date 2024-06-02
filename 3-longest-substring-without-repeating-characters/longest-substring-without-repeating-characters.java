class Solution {
    public int lengthOfLongestSubstring(String s) {
        return String1(s);
    }
     public static int String1(String s){
    //    
    int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int longest = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                longest = Math.max(longest, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return longest;
    }
}