// Title: Remove All Adjacent Duplicates In String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/


            if(ch != stackArr[top]){
                stackArr[++top] = ch ; 
            }
            else {
                top-- ; 
            }
        }

        String str = ""; 
        for(int i = 0 ; i<=top ; i++){
            str += stackArr[i] ; 
        }

        return str ; 
    }
}
