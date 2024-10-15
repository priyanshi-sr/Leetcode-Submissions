class Solution {
    public long minimumSteps(String s) {
        long sw = 0;
        int b =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                sw+=(long) b;
            }
            else{
                b++;
            }
        }
        return sw;
    }
}