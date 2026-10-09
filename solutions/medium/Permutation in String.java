// Title: Permutation in String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/permutation-in-string/


        while (right < s2.length()) {
            // right ko include kro 
            int indexRight = s2.charAt(right) - 'a';
            arr[indexRight]++;

        }
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        for (int i = 0; i < s1.length(); i++) {
            // Map of all the element of the s1 string 
        int right = 0;
        int arr[] = new int[26];


        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
            if (arr[index] != map.get(ch))
                return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
class Solution {

    boolean check(HashMap<Character, Integer> map, int[] arr) {
        for (char ch : map.keySet()) {
            int index = ch - 'a';
