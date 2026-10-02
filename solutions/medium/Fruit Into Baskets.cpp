// Title: Fruit Into Baskets
            // Difficulty: Medium
            // Language: C++
            // Link: https://leetcode.com/problems/fruit-into-baskets/

class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int l = 0;
        int r = 0;
        int n = fruits.size();
        int type = 0;
        map<int,int> freq;
        int ans = 0;

        while(r < n)
        {
            freq[fruits[r]]++;
            if(freq[fruits[r]] == 1) type++;
            while(l <= r && type > 2)
            {
                freq[fruits[l]]--;
                if(freq[fruits[l]] == 0) type--;
                l++;
            }
            if(type <= 2)
