class Solution {
    public int removeDuplicates(int[] nums) {
       Arrays.sort(nums);
       
       if (nums.length == 0) return 0;
        
        int l = 0; // Use 'l' as the slow-runner
        int r = 1; // Use 'r' as the fast-runner
        
        while (r < nums.length) {
            if (nums[r] != nums[l]) { // Check if the current element is different from the last unique element
                l++; // Move the slow-runner to the next position
                nums[l] = nums[r]; // Update the next position with the current element
            }
            r++; // Move the fast-runner to the next position
        }
        
        return l + 1; // Return the length of the array with unique elements
    }
}