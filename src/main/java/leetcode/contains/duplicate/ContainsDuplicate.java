package leetcode.contains.duplicate;

import java.util.HashSet;

public class ContainsDuplicate {

  public static void main(String[] args) {
    System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    System.out.println(new ContainsDuplicate().containsDuplicateSet(new int[]{1, 2, 3, 1}));
  }

  public boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean containsDuplicateSet(int[] nums) {
    var seen = new HashSet<>();
    for (int num : nums) {
      if (!seen.add(num)) {
        return true;
      }
    }
    return false;
  }
}
