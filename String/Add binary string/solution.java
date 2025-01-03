// Add Binary Strings
import java.util.Scanner;

public class solution {
  public static String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int i = a.length() - 1, j = b.length() - 1, carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0)
        sum += a.charAt(i--) - '0';
      if (j >= 0)
        sum += b.charAt(j--) - '0';
      result.append(sum % 2);
      carry = sum / 2;
    }
    if (carry != 0)
      result.append(carry);
    String finalResult = result.reverse().toString();
    int index = 0;
    while (index < finalResult.length() && finalResult.charAt(index) == '0') {
      index++;
    }
    return index == finalResult.length() ? "0" : finalResult.substring(index);
  }

  public static void main(String[] args) {
    System.out.print("""
        Add Binary String
        Enter two binary strings:
        """);
    String a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextLine();
    b = sc.nextLine();
    sc.close();
    System.out.println("Addition: " + addBinary(a, b));
  }
}