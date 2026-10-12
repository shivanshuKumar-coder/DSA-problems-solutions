// Title: Happy Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/happy-number/


    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = squareOfEachDigit(slow);
            fast = squareOfEachDigit(fast);
            fast = squareOfEachDigit(fast);
            if(slow == 1 && fast == 1) break ; 
            if (slow == fast) {
                return false;
            }

        }
        return true;
    }

            
}
