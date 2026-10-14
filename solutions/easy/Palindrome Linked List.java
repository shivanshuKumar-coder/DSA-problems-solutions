// Title: Palindrome Linked List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-linked-list/

        // odd number length skip the middle node  
        if (fast != null) {
            slow = slow.next;
        }

        // now reverse the half of the linked list 
        while (slow != null) {
            ListNode nextNodeAddress = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNodeAddress;

        }

        // now compare both 
        ListNode left = head ; 
        ListNode right = prev ;

        while(right!= null){
            if(left.val != right.val)
                return false ; 
        ListNode prev = null ; 
