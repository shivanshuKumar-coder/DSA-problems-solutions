// Title: Middle of the Linked List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/middle-of-the-linked-list/

        }else {
            count = count / 2 +1;
        }

        p = head ; 
        while(count >1 ){
            count-- ; 
            p = p.next ; 
        }

        return p ; 
    }
}
            count = count / 2 + 1;
