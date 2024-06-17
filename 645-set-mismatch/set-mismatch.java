class Solution {
  public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] er = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                if(nums[i]==i+1){
                    er[0] = nums[i];
                    i++;
                    while(i<nums.length && nums[i]==i){
                        i++;
                    }
                    er[1] = i;
                    break;
                }
                else{
                    er[0] = nums[i];
                    while(i>-1 && nums[i]!=i+1){
                        i--;
                    }
                    if(i<0){
                        er[1] = 1;
                    }
                    else{
                        er[1] = i+2;
                    }
                    break;
                }
            }
        }
        return er;
    }

}