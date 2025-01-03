import java.math.BigInteger;
import java.util.Scanner;

public class solution {
  public static String addBinary(String a, String b) {
    BigInteger num1, num2;
    num1 = new BigInteger(a, 2);
    num2 = new BigInteger(b, 2);
    num1.add(num2);
    return num1.toString(2);
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