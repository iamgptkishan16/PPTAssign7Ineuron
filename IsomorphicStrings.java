/*
 * Question---[1]  Given two strings s and t, *determine if they are isomorphic*.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "egg", t = "add"
 ** 
 * Output:** true
 */


import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                if (map.containsValue(c2))
                    return false;
                map.put(c1, c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t)); // Output: true
    }
}
