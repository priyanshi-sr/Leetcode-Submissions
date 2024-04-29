class Solution {
    public int minOperations(int[] nums, int k) {
    int xorSum = 0;
    
    // Calculate the XOR of all elements in the array
    for (int num : nums) {
        xorSum ^= num;
    }
    
    // Compute the XOR of the original XOR result and the target k
    int targetXOR = xorSum ^ k;
    
    // Count the number of set bits in the resulting XOR value
    int count = 0;
    while (targetXOR > 0) {
        count += targetXOR & 1;
        targetXOR >>= 1;
    }
    
    return count;
}
}
