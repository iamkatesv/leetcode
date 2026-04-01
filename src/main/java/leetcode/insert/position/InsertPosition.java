package leetcode.insert.position;

import java.util.Arrays;

public class InsertPosition {

  public static void main(String[] args) {
    System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
  }

  public static int searchInsert(int[] nums, int target) {
    int index = Arrays.binarySearch(nums, target);
    return index >= 0 ? index : -index - 1;
  }
}
