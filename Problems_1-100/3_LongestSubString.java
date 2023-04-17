import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                i = map.get(c);
                map.clear();
            }
            if (map.size() > longestLength) {
                longestLength = map.size();
            }
        }

        return longestLength;

    }
}
