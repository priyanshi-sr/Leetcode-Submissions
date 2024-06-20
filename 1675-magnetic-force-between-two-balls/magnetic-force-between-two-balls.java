import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return largest_Distance(position, m);
    }

    public static int largest_Distance(int[] position, int m) {
        int lo = 1;
        int hi = position[position.length - 1] - position[0];
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  // Use this to avoid potential overflow
            if (isitpossible(position, m, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] position, int m, int mid) {
        int pos = position[0];
        int c = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - pos >= mid) {
                c++;
                pos = position[i];
            }
            if (c == m) {
                return true;
            }
        }
        return false;
    }
}
