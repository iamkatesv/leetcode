package leetcode.group.annagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnnagram {

  public static void main(String[] args) {
    System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
  }

  public static List<List<String>> groupAnagrams(String[] strings) {
    Map<String, List<String>> map = new HashMap<>();

    for (String string : strings) {
      char[] arr = string.toCharArray();
      Arrays.sort(arr);
      String key = new String(arr);
      map.computeIfAbsent(key, k -> new ArrayList<>())
          .add(string);
    }

    return new ArrayList<>(map.values());
  }
}
