// Title: Minimum Window Substring
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-window-substring/

                sMap.put(s.charAt(left) ,sMap.getOrDefault(s.charAt(left), 0) - 1 );
                left++;
            }
            right++;
        }

        String str = "";
        if (start == -1) {
            return str;
        }
        str = s.substring(start, end+1);

        return str;
    }
}
