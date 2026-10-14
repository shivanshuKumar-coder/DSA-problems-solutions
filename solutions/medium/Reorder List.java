// Title: Reorder List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reorder-list/

        while (slow != null) {
            ListNode nextNodeAddress = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNodeAddress;

        }


        // now we have to list add in first 
        ListNode left = head ; 
        ListNode right = prev; 

        while(right!= null){
            ListNode leftNextNode = left.next; 
            left.next = right ; 
            ListNode rightNextNode = right.next ; 
            right.next = leftNextNode ; 
