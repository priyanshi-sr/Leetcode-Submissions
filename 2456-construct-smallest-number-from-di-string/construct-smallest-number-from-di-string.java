class Solution {
    public String smallestNumber(String str) {
        return(Construct(str));
    }
        public static String Construct(String str) {
        int[] ans = new int[str.length() + 1];
        Stack<Integer> st = new Stack<>();// for index
        int count = 1;

        // Process the input string
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == 'I') {
                ans[i] = count++;
                while (!st.isEmpty()) {
                    ans[st.pop()] = count++;
                }
            } else {
                st.push(i);
            }
        }

        // Construct the resulting string
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            s.append(ans[i]);
        }
        return s.toString();
    }
}