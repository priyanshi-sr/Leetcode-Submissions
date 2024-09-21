class Solution {
    public List<Integer> lexicalOrder(int n) {
     ArrayList<Integer> ans = new ArrayList<>();
            printLexicographicalNumbers(n, 1, ans);
           return ans;
        }

        public static void printLexicographicalNumbers(int n,int i, ArrayList<Integer> ans){
            if (i > n) return;
            ans.add(i);
            printLexicographicalNumbers(n, i * 10, ans);
            if (i % 10 != 9)
            printLexicographicalNumbers(n, i + 1, ans);
        }
}