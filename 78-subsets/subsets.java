class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        Arrays.sort(arr);
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Subsets(arr, ans, ll, 0);
        return(ans);
    }
     public static void Subsets(int[] arr, List<List<Integer>> ans, List<Integer> ll, int idx) {
        ans.add(new ArrayList<>(ll));
        for (int i = idx; i < arr.length; i++) {
            ll.add(arr[i]);
            Subsets(arr, ans, ll, i + 1);
            ll.remove(ll.size() - 1);
        }

    }
}