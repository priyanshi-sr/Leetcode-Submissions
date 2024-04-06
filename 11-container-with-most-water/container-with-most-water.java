class Solution {
    public int maxArea(int[] height) {
        return(Water(height));
    }
    public static int Water(int[] height) {
    if (height.length == 0) return 0;
    int left = 0;
    int right = height.length - 1;
    int maxarea = 0;
    while (left < right) {
        int minHeight = Math.min(height[left], height[right]);
        int currentArea = minHeight * (right - left);
        maxarea = Math.max(maxarea, currentArea);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--; // Fix: Decrement right instead of incrementing
        }
    }
    return maxarea;
}

}