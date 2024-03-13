class Solution {
    public int[] twoSum(int[] nums, int target) {
        return Sum(nums,target);
    }
     public static int[] Sum(int[] nums, int target){
//        int sum =0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
            if(nums[i]+nums[j] == target ){
                return new int[]{i,j}; // for returning indices

            }
            }


        }
        return new int[]{-1,-1}; // if no pair is found
    }
}
