package leetcode.anagram;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("rat", "car"));
  }

  public static boolean isAnagram(String leftString, String rightString) {
    if (leftString.length() != rightString.length()) {
      return false;
    }
    char[] leftStringCharArray = leftString.toCharArray();
    char[] rightStringCharArray = rightString.toCharArray();
    Arrays.sort(leftStringCharArray);
    Arrays.sort(rightStringCharArray);
    return Arrays.equals(leftStringCharArray, rightStringCharArray);
  }

}
