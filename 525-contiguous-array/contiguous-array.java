class Solution {
    public int findMaxLength(int[] arr) {
        return(Contiguous(arr));
    }
     public static int Contiguous(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxLen = 0;
        int sum = 0;
        int[] sumIndex = new int[arr.length * 2 + 1]; // Store the first occurrence index of each sum
        for (int i = 0; i < sumIndex.length; i++) {
            sumIndex[i] = -1; // Initialize all indices to -1
        }
        sumIndex[arr.length] = 0; // Handle the initial sum of 0 at index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 1 ? 1 : -1;
            int index = sum + arr.length;
            if (sumIndex[index] != -1) {
                maxLen = Math.max(maxLen, i - sumIndex[index] + 1);
            } else {
                sumIndex[index] = i + 1; // Store the current index (shifted by 1 because initial index is 0)
            }
        }

        return maxLen;
    }
}