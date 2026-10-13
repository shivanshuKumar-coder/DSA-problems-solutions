// Title: Find the Duplicate Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
        }
        return -1 ; 
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
    }
            else return nums[i]; 
                continue ; 
}
