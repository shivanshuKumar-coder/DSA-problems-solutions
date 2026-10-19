// Title: Maximum Subarray Sum with One Deletion
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            noDelete = Math.max(noDelete + arr[i], arr[i]);
            ans = Math.max(ans, Math.max(oneDelete, noDelete));
        }
        return ans;
        int prevNoDelete = arr[0];

            oneDelete = Math.max(oneDelete + arr[i], prevNoDelete);


            if (oneDelete == Integer.MIN_VALUE)
                oneDelete = arr[0];


        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
            prevNoDelete = noDelete;
    }
}
    public int maximumSum(int[] arr) {

