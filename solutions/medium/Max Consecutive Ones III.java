// Title: Max Consecutive Ones III
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/max-consecutive-ones-iii/

                maxFreq += 1;
            int windowSize = right - left + 1;
            int replace = windowSize - maxFreq;

            while (replace > k) {


            if (nums[right] == 1)
                if(nums[left] == 1)
                    maxFreq-= 1 ; 

