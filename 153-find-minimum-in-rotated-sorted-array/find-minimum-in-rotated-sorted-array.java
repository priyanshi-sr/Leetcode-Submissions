class Solution {
    public int findMin(int[] arr) {
        return(Binary(arr));
    }
      public static int Binary(int[] arr) {
         int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // The loop ends when left == right, which points to the smallest element
        return arr[left];
    }
}