
    class Solution { public int subarraysDivByK(int[] nums, int k) { int count = 0; int sum = 0; HashMap<Integer, Integer> remainderMap = new HashMap<>(); remainderMap.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
        sum = (sum + nums[i]) % k;
        if (sum < 0) {
            sum += k;
        }
        if (remainderMap.containsKey(sum)) {
            count += remainderMap.get(sum);
        }
        remainderMap.put(sum, remainderMap.getOrDefault(sum, 0) + 1);
    }

    return count;
}
}