
/*
 *Question [2]-- Given a string num which represents an integer, return true *if* num *is a
 * **strobogrammatic number***.
 * 
 * A **strobogrammatic number** is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 ** 
 * Example 1:**
 ** 
 * Input:** num = "69"
 ** 
 * Output:**
 * 
 * true
 */

import java.util.HashMap;

public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);

            if (!map.containsKey(c1) || map.get(c1) != c2)
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "69";
        System.out.println(isStrobogrammatic(num)); // Output: true
    }
}
