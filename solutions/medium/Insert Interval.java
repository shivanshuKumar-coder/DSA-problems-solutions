// Title: Insert Interval
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/insert-interval/

            i++;
        }
        if(insert == false){
        insertedArr[idx][0] = newInterval[0];
        insertedArr[idx][1] = newInterval[1];
        }

        int ans[][] = new int[insertedArr.length][2];
        idx = 0;
        int start1 = insertedArr[0][0];
        int end1 = insertedArr[0][1];

        for (int j = 1; j < insertedArr.length; j++) {
            int start2 = insertedArr[j][0];
            int end2 = insertedArr[j][1];

            if (end1 >= start2) { // merge hoga
