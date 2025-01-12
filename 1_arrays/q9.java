import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // If there are no intervals, return an empty array
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals based on the starting time of each interval
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Initialize with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // Iterate over the rest of the intervals
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Check if the current interval overlaps with the next interval
            if (currentEnd >= nextStart) {
                // Merge the intervals by updating the end of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval as a new interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Convert the list to a 2D array and return the merged intervals
        return merged.toArray(new int[merged.size()][]);
    }
}
