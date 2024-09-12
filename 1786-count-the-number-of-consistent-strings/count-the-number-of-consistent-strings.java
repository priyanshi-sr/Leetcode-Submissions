class Solution {
   public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        // Create a set of allowed characters for fast lookup
        Set<Character> allowedSet = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }

        // Loop through each word in the words array
        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;

            // Loop through each character of the current word
            for (int j = 0; j < words[i].length(); j++) {
                // If the character is not in the allowed set, mark the word as inconsistent
                if (!allowedSet.contains(words[i].charAt(j))) {
                    isConsistent = false;
                    break;
                }
            }

            // If the word is consistent, increment the count
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}