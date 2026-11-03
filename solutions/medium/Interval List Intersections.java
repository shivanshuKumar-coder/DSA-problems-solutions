// Title: Interval List Intersections
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/interval-list-intersections/

                int arr[] = { Math.max(start1, start2), Math.min(end1, end2) };
                intersection[idx++] = arr;
            }
            if (end2 >= start1 && start2 < start1) {
            if (end1 >= start2 && start1 <=start2) {
            // check for interesection 

            int end2 = secondList[secondIdx][1];
            int start2 = secondList[secondIdx][0];

            int end1 = firstList[firstIdx][1];
            int start1 = firstList[firstIdx][0];
                int arr[] = { Math.max(start1, start2), Math.min(end1, end2) };
                intersection[idx++] = arr;
            }

