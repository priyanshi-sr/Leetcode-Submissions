class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Create a frequency map for characters in s1
        HashMap<Character, Integer> originalMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            originalMap.put(c, originalMap.getOrDefault(c, 0) + 1);
        }

        // Sliding window pointers
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>(originalMap);

        while (j < s2.length()) {
            char c = s2.charAt(j);

            // If the character is not in s1, reset the window and map
            if (!map.containsKey(c)) {
                i++;
                j = i;
                map = new HashMap<>(originalMap);
                continue;
            } else {
                // Update the map by decrementing character count
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }

                // If the window size matches s1 length, check if it's a valid permutation
                if (j - i + 1 == s1.length()) {
                    return true;
                }
            }

            // Move the window
            j++;
        }

        return false;
    }
}