package leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intervals {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
  }


  public static int[][] merge(int[][] intervals) {
    if (intervals == null || intervals.length <= 1) {
      return intervals;
    }

    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    List<int[]> merged = new ArrayList<>();
    merged.add(intervals[0]);

    for (int i = 1; i < intervals.length; i++) {
      int[] last = merged.getLast();
      int[] current = intervals[i];

      if (current[0] <= last[1]) {
        last[1] = Math.max(last[1], current[1]);
      } else {
        merged.add(current);
      }
    }

    return merged.toArray(new int[merged.size()][]);
  }
}
