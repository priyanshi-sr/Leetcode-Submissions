class Solution {
    public String removeKdigits(String num, int k) {
        return(Remove(num,k));
    }
      public static String Remove(String num, int k) {

    Stack<Character> stack = new Stack<>();
        
        // Iterate through each digit in num
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            
            // While there are digits in the stack, k is greater than 0, 
            // and the top of the stack is greater than the current digit, 
            // pop the stack and decrement k
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            
            // If the stack is empty and the current digit is '0', don't push it onto the stack
            if (!stack.isEmpty() || digit != '0') {
                stack.push(digit);
            }
        }
        
        // If k is still greater than 0, remove remaining digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // If the stack is empty, return "0"
        if (stack.isEmpty()) {
            return "0";
        }
        
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert digits at the beginning to maintain the correct order
        }

        return result.toString();
    }
}