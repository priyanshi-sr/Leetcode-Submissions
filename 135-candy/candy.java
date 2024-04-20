class Solution {
    public int candy(int[] ratings) {
        return (candy1(ratings));    }
     public static int candy1(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];

        // Traverse from left to right to calculate left candies
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1; // since we are traversing left so it is minus
            }
        }

        // Traverse from right to left to calculate right candies
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int candies = ratings.length; // At least 1 candy to each child
        for (int i = 0; i < ratings.length; i++) {
            candies += Math.max(left[i], right[i]);
        }

        return candies;
    }
}
