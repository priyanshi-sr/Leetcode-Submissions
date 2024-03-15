class Solution {
    public int singleNumber(int[] arr) {
        return(Single(arr));
    }
     public static int Single(int[] arr){
        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                if (count == 1)
                    return arr[i];
        }
    return -1;
    }
}