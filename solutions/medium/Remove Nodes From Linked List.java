// Title: Remove Nodes From Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-nodes-from-linked-list/

            if(st.peek() >= newList.val){
                ListNode newNode = new ListNode(st.peek());
                newNode.next = newList ;  
                newList = newNode ; 
            }

            st.pop(); 
        }
        while(!st.empty()){

        st.pop(); 
        ListNode newList = new ListNode (st.peek()); 

        }
