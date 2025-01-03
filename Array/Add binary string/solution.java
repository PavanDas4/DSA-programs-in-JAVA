import java.util.Scanner;

public class solution {
  public static String addBinary(String a, String b) {
    String sum = "";
    int num1, num2;
    num1 = Integer.parseInt(a, 2);
    num2 = Integer.parseInt(b, 2);
    int sumInt = num1 + num2;
    sum = Integer.toBinaryString(sumInt);
    return sum;
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