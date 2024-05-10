class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        return(kthSmallestFraction1(arr,k));
    }
     public static int[] kthSmallestFraction1(int[] arr, int k) {
     
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
        
            double fracA = (double) a[0] / a[1];
            double fracB = (double) b[0] / b[1];
            return Double.compare(fracA, fracB);
        });

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               
                heap.offer(new int[]{arr[i], arr[j]});
            }
        }

       
        int[] result = new int[2];
        for (int count = 0; count < k; count++) {
            result = heap.poll();
        }

        return result;
    }
}