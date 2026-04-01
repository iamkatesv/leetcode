package leetcode.longest.substring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }

  public static int lengthOfLongestSubstring(String string) {
    Map<Character, Integer> lastSeen = new HashMap<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < string.length(); right++) {
      char current = string.charAt(right);

      if (lastSeen.containsKey(current)) {
        left = Math.max(left, lastSeen.get(current) + 1);
      }

      lastSeen.put(current, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }

}
