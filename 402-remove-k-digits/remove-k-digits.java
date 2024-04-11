class Solution {
    public String removeKdigits(String num, int k) {
        return(Remove(num,k));
    }
      public static String Remove(String num, int k) {

     Stack<Character> stack = new Stack<>();

        // Iterate through each digit in num
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            if (!stack.isEmpty() || digit != '0') {
                stack.push(digit);
            }
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) {
            return "0";
        }



        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert digits at the beginning to maintain the correct order
        }

        return result.toString();
    }
}