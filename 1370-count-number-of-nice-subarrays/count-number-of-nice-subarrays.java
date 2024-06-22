class Solution {
     public int numberOfSubarrays(int[] nums, int k) {
        int[] count_odds = new int[nums.length + 1];
        count_odds[0] = 1;  //For the time when sum - k is 0
        int subarray_count = 0;
        int t = 0;
        for(int num : nums)
        {
            t += num & 1;  //If it is odd then num & 1 will be 1 , if even then 0
            if(t - k >= 0)
                subarray_count += count_odds[t - k];
            
            count_odds[t]++;
        }
        return subarray_count;
    }
}