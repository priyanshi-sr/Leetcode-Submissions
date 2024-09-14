class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 0) return 0;
       int maxNum = Integer.MIN_VALUE;
       for(int num:nums){
        if(num>maxNum){
            maxNum=num;
        }
       }
       int l =0;
       int cl =0;
       for(int num:nums){
        if(num == maxNum){
            cl++;
            l=Math.max(l,cl);
        }
        else{
            cl=0;
        }
       }
       return l;
    }
}