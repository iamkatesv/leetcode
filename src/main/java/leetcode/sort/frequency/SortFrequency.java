package leetcode.sort.frequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortFrequency {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
  }

  public static int[] frequencySort(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.merge(num, 1, Integer::sum);
    }

    Integer[] boxed = Arrays.stream(nums)
        .boxed()
        .toArray(Integer[]::new);

    Arrays.sort(boxed, (a, b) -> {
      int byFreq = Integer.compare(freq.get(a), freq.get(b));
      return byFreq != 0 ? byFreq : Integer.compare(b, a);
    });

    return Arrays.stream(boxed)
        .mapToInt(Integer::intValue)
        .toArray();
  }

}
