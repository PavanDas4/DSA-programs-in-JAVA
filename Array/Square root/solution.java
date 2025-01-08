import java.util.Scanner;

public class solution {
  public static int sqrt(int x) {
    return (int) Math.sqrt(x);
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(sqrt(x));
    sc.close();
  }
}