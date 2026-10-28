// Title: Subarray Sums Divisible by K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
            count += map.getOrDefault(remainder, 0);
        int count = 0;
        return count ;
    }
        map.put(0, 1);
        // reaminder 0 one time seen 
            if(remainder < 0) 
                remainder = remainder + k ; 
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
    public int subarraysDivByK(int[] nums, int k) {
class Solution {
            
