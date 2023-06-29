/*
 * Question [6]-----Given two strings s and goal, return true *if and only if* s *can become*
 * goal *after some number of **shifts** on* s.
 * 
 * A **shift** on s consists of moving the leftmost character of s to the
 * rightmost position.
 * 
 * - For example, if s = "abcde", then it will be "bcdea" after one shift.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "abcde", goal = "cdeab"
 ** 
 * Output:**
 * 
 * true
 */

public class StringShifts {
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        String doubleS = s + s;
        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShift(s, goal)); // Output: true
    }
}
