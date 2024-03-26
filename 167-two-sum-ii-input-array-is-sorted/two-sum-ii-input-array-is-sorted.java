class Solution {
    public int[] twoSum(int[]arr, int target) {
        return(Sum(arr,target));
    }
    public static int[] Sum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i+1, j+1}; // for returning indices

                }
            }


        }
        return new int[]{-1, -1}; // if no pair is found
    }
}