
// Strings Rotations of Each Other
import java.util.Scanner;

public class solution {
  public static boolean StringRotation(String s1, String s2) {
    for (int i = 0; i < s1.length(); i++) {
      if (s1.equals(s2)) {
        return true;
      }
      s1 = s1.substring(1) + s1.charAt(0);
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.print("Check whether string is rotation of each other\nEnter the first string: ");
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    System.out.print("Enter the Second string: ");
    String s2 = sc.nextLine();
    sc.close();
    System.out.println(StringRotation(s1, s2) ? "True" : "False");
  }
}