class Solution {
    public void moveZeroes(int[] arr) {
        Zeroes(arr);
    }
     public static void Zeroes(int[] arr) {
        if (arr.length == 0) return;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) { // if we encountered a non zero element
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        for (int num : arr) {
        System.out.print(num + " ");
    }


    }
}