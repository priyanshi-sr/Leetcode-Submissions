class Solution {
    public int countTriplets(int[] arr) {
        return(Triplet(arr));
    }
     public static int Triplet(int[] arr){
        int c =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int a =0;
                for (int k = i; k < j; k++) {
                    a^=arr[k];
                }
                int b =0;
                for (int k = j; k < arr.length; k++) {
                    b^=arr[k];
                    if(a==b){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}