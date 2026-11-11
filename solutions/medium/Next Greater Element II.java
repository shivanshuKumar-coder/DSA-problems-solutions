// Title: Next Greater Element II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/next-greater-element-ii/

        int ans[] = new int[n];

        // because of the array is circular we have to find the last index greater 
        element
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[n - 1])
                st.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums[i]) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
