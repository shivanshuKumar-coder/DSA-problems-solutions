// Title: Merge Intervals
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/merge-intervals/

            // merge nahi hoga toh answer mein daaal doo
            int arr[] = { start1, end1 };
            ans[idx++] = arr;
            start1 = start2;
            end1 = end2;
        }

        int arr[] = { start1, end1 };
        ans[idx++] = arr;
        return Arrays.copyOf(ans ,idx);
    }
        
}
