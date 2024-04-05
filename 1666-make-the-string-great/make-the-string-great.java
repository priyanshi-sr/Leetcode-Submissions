class Solution {
    public String makeGood(String s) {
        return(Great(s));
        
    }
     public static String Great(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) { // check using ascii values
                //If the absolute difference is 32, it means that the characters
                // are the same letter, but one is uppercase and the other is lowercase.
                // This indicates a bad pair according to the problem statement.
                stack.pop(); // Remove the bad pair
            } else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}