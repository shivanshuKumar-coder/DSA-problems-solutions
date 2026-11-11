// Title: Daily Temperatures
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/daily-temperatures/

        
        stack[++top] = n-1; 
        ans[n-1] = 0 ; 

        int ans[] = new int[n]; 

        int stack[] = new int[n]; 
        int top = - 1 ; 
        int n = temperatures.length ; 
    public int[] dailyTemperatures(int[] temperatures) {
        for(int i  = n-2 ; i>= 0 ; i--){

