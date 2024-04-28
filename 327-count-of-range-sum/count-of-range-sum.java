class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        return(Range(nums,lower,upper));
    }
      public static int Range(int[] nums, int lower, int upper) {
        if (nums.length == 0) return 0;

        // Calculate the prefix sums
        long[] prefixSums = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }

        // Use merge sort to count the range sums
        return mergeSortAndCount(prefixSums, 0, prefixSums.length - 1, lower, upper);
    }

    private static int mergeSortAndCount(long[] prefixSums, int start, int end, int lower, int upper) {
        if (start == end) {
            return 0;
        }

        int mid = (start + end) / 2;
        int count = mergeSortAndCount(prefixSums, start, mid, lower, upper)
                  + mergeSortAndCount(prefixSums, mid + 1, end, lower, upper);

        int j = mid + 1, k = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && prefixSums[j] - prefixSums[i] < lower) {
                j++;
            }
            while (k <= end && prefixSums[k] - prefixSums[i] <= upper) {
                k++;
            }
            count += k - j;
        }

        // Merge the sorted halves
        merge(prefixSums, start, mid, end);

        return count;
    }

    private static void merge(long[] prefixSums, int start, int mid, int end) {
        long[] temp = new long[end - start + 1];
        int left = start, right = mid + 1, index = 0;
        while (left <= mid && right <= end) {
            if (prefixSums[left] < prefixSums[right]) {
                temp[index++] = prefixSums[left++];
            } else {
                temp[index++] = prefixSums[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = prefixSums[left++];
        }
        while (right <= end) {
            temp[index++] = prefixSums[right++];
        }
        System.arraycopy(temp, 0, prefixSums, start, temp.length);
    }
}