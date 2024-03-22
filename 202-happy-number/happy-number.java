class Solution {
    public boolean isHappy(int n) {
        return(Happy_Shappy(n));
    }
     public static boolean Happy_Shappy(int n) {
        Set<Integer> visited = new HashSet<>();
        return isHappy(n, visited);
    }

    private static boolean isHappy(int n, Set<Integer> visited) {
        if (n == 1 || n == 7) {
            return true;
        }
        if (visited.contains(n)) {
            return false; // Cycle detected, n is not a happy number
        }
        visited.add(n);
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return isHappy(sum, visited);
    }
}