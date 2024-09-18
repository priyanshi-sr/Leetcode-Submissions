class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         List<Integer> intersectionList = getIntersection(nums1, nums2);
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }
        return result;
    }

    public static List<Integer> getIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
    }
