/*
 *Question [3]----- Given two non-negative integers, num1 and num2 represented as string, return
 * *the sum of* num1 *and* num2 *as a string*.
 * 
 * You must solve the problem without using any built-in library for handling
 * large integers (such as BigInteger). You must also not convert the inputs to
 * integers directly.
 ** 
 * Example 1:**
 ** 
 * Input:** num1 = "11", num2 = "123"
 ** 
 * Output:**
 * 
 * "134"
 */

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2)); // Output: "134"
    }
}
