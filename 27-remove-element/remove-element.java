class Solution {
    public int removeElement(int[] nums, int vals) {
        return(Rem(nums,vals));
    }
    public  static int Rem(int[] nums,int vals){
        int i =0;
        for (int j = 0; j < nums.length ; j++) { // j iterates through the array and i keeps the track of the position where we want to place the next non-duplicate element
            if(nums[j] != vals){
                nums[i] = nums[j];
                i++;
            }

        }
        return i;
    }
}