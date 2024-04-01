class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int size=str.length;
        int len=str[size-1].length();
        return len;
    }
}