class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> res = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int ind = Math.abs(nums[i]) - 1;
            if (nums[ind] < 0) {
                res.add(ind + 1);  //If the value at the calculated index (nums[ind]) is already negative, it means this value has been encountered before. So, it adds ind+1 to the res list,
                // indicating that ind+1 is a duplicate.
            } else {
                nums[ind] *= -1;
                // you can use any of the below to mark it as negative
                // nums[ind] *= -1;
                // nums[ind] = -nums[ind];
            }
        }
        return res;
    }   
    
}