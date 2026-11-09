// Title: Valid Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-parentheses/

                stack[++top] = ch;
            }

            else {
                // special case : if closing comes first then complete string is invalid 
                if (top == -1) {
                    if (ch == '}' || ch == ']' || ch == ')')
                        return false;
                }

                // now check for closing brackets in stack 
                if (ch == ')' && stack[top] == '(')
                    top--;
                else if (ch == ']' && stack[top] == '[')
                    top--;
                else if (ch == '}' && stack[top] == '{')
                    top--;

                else
                    return false;
