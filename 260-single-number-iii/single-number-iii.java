class Solution {
    public int[] singleNumber(int[] arr) {
        return(single(arr));
        
    }
     public static int[] single(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                ans.add(arr[i]);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}