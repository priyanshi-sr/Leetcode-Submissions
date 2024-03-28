class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        return(intersection(nums1,nums2));
    }
      public static int[] intersection(int[] nums1, int[] nums2) {
        // Using HashMap to store frequency of elements in nums1
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();

        // Iterating through nums2 and checking against nums1 frequency
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersectionList.add(num);
                freqMap.put(num, freqMap.get(num) - 1); // Decrementing frequency
            }
        }

        // Converting List to array
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionArray.length; i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        return intersectionArray;
    }
}