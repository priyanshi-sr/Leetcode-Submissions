class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
            else{
                map.put(nums[i],true);
            }
            if(map.containsKey(nums[i]+1)){
                map.put(nums[i]+1,false);
            }
        }
        int ans = 0;
        for(int v:map.keySet()){
            if(map.get(v)){
                int count=0;
                while(map.containsKey(v)){
                    v++;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}