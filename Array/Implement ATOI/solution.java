// Implement ATOI

import java.util.Scanner;

public class solution {
    static int ATOI(String s) {
        int sign = 1, res = 0, idx = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') // Remove leading spaces
            idx++;
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) { // Check for sign
            if (s.charAt(idx++) == '-')
                sign = -1;
        }
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') { // Read digits
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) { // Overflow
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res + (s.charAt(idx++) - '0'); // Update result
        }
        return res * sign; // Return result
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(ATOI(s));
    }
}