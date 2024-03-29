/*
 * Question [5]-------Given a string s and an integer k, reverse the first k characters for every
 * 2k characters counting from the start of the string.
 * 
 * If there are fewer than k characters left, reverse all of them. If there are
 * less than 2k but greater than or equal to k characters, then reverse the
 * first k characters and leave the other as original.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "abcdefg", k = 2
 ** 
 * Output:**
 * 
 * "bacdfeg"
 */


public class ReverseStringGroups {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int start = 0; start < chars.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, chars.length - 1);

            while (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k)); // Output: "bacdfeg"
    }
}
