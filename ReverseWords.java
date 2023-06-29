/*
 *Question[4]----  Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "Let's take LeetCode contest"
 ** 
 * Output:** "s'teL ekat edoCteeL tsetnoc"
 */


public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverseString(word));
            result.append(" ");
        }

        return result.toString().trim();
    }

    private static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
