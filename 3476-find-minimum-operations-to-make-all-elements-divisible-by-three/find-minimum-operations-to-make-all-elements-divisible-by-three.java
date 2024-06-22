class Solution {
   
       public int minimumOperations(int[] nums) {
        if(nums.length==0) return 0;
        int res =0;
        for(int i =0;i<nums.length;i++){
            res+=Math.min(nums[i] % 3, 3 - (nums[i] % 3));
            
        }
        return res;
    
    }
}