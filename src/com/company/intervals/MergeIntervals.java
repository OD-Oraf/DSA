package com.company.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] mergeIntervals(int[][] intervals) {
        // sort array based on first number
        // for each interval compare the end of current against the beggining or the next
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i =1; i < intervals.length; i++) {
            int[] interval = result.get(i -1);
            // Push current intercal as is - no merge
            // End of current is less than start of next
            // end of current is greater than end of next
            if (interval[1] > intervals[i][1] || interval[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } else if (interval[1] > intervals[i][0] && interval[1] < intervals[i][1]) {
                result.add(new int[]{interval[1], intervals[i][1]});
            }

            // merge condition



        }

        return intervals;
    }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,4}, {2 ,5}, {7, 9}};
    }
}
