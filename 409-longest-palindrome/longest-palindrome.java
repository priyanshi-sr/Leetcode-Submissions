class Solution {
    public int longestPalindrome(String s) {
        return(longest_Palindrome(s));
    }
     public static int longest_Palindrome(String s) {
        int[] charcount = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charcount[s.charAt(i)]++;
        }
        int longest = 0;
        boolean found = false;
        for(int count : charcount){
            if(count%2==0){
                longest+= count;
            }
            else {
                longest += count-1;
                found = true;
            }
        }
        if( found){
            longest++;
        }
        return longest;
    }
}