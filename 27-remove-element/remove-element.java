class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            if(nums[l]== val){
                nums[l]=nums[r];
                r--;
            }
            else{
                l++;
            }
        }
        
        return r+1;
    }
}