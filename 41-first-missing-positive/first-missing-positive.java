class Solution {
    public int firstMissingPositive(int[] nums) {
        return(Positive(nums));
        
    }
    public static int Positive(int[] nums) {
        
int i=0;
     int n= nums.length;
      while(i<n){

          int crt= nums[i]-1;
          if( nums[i]>0 && nums[i]<n && nums[i]!=nums[crt])
          {
              int temp= nums[i];
              nums[i]= nums[crt];
              nums[crt]= temp;
          }else
          {
             i++;
          }
         
      }
      if(nums[0]!=1)
      {
          return 1;
      }
       System.out.println(Arrays.toString(nums));
      for(int j=0;j<nums.length;j++)
      {
          if(nums[j]!= j+1)
          return j+1;
      }


   return n+1;
    }
}
