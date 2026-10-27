// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);

        for (int i = 0; i < nums.length; i++) {
    }
        }
            sum = sum + nums[i];
            // now check sum - k avaliable in the hashmap 
            int freq = map.getOrDefault(sum - k, 0);
            count += freq;
            map.put(sum, map.getOrDefault(sum, 0) + 1);

            // store the current sum in the hashmap to access in the other index ; 

        return count ; 
}
class Solution {
