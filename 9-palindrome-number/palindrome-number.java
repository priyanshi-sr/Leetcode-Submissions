class Solution {
    public boolean isPalindrome(int x) {
        // using 2 pointer approach
        String s =String.valueOf(x);
        int l =0;
        int r =s.length()-1;
        while(l<r){
            if(s.charAt(l)!= s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}