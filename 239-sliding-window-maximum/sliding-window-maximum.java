
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        return (sliding(arr,k));
        

    }
    public static int[] sliding(int[] arr,int k){
        int[] ans = new int[arr.length-k+1];
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.getLast()] <arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }
        int j = 0;
        ans[j++] = arr[dq.getFirst()];
        for(int i=k;i<arr.length;i++){
            while(!dq.isEmpty()&& arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.add(i);
            if(i-k==dq.getFirst()){
                dq.remove();
            }
            ans[j++] = arr[dq.getFirst()];
        }
        return ans;
    }

}