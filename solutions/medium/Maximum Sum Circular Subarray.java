// Title: Maximum Sum Circular Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-sum-circular-subarray/


        for (int i = 1; i < nums.length; i++) {
            bestMax = Math.max(nums[i], nums[i] + bestMax);
        }


        int maxAns = nums[0];
            maxAns = Math.max(maxAns, bestMax);
            minAns = Math.min(minAns, bestMin);

            totalSumOfArr += nums[i];


            bestMin = Math.min(nums[i], nums[i] + bestMin);
        int minAns = nums[0];
        int totalSumOfArr = nums[0];
        return Math.max(maxAns, totalSumOfArr - minAns);
        if (totalSumOfArr - minAns == 0)
            return maxAns;
    }
}
