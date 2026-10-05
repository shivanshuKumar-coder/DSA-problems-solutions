// Title: Minimum Size Subarray Sum
            // Difficulty: Medium
            // Language: C++
            // Link: https://leetcode.com/problems/minimum-size-subarray-sum/

            sum += nums[right];

            // information galat hai toh usko sahi kro
            while (sum >= target) {
                minLen = min(right - left + 1, minLen);

            right++;
        }

        if (minLen == INT_MAX)
        while (right < nums.size()) {

        int sum = 0;
            // informatin sahi hai to add to it answer

            }
                sum -= nums[left - 1];
                left++;
        int minLen = INT_MAX;
        int right = 0;
        int left = 0;

    int minSubArrayLen(int target, vector<int>& nums) {
