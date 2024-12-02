
// Non Repeating Character
import java.util.Scanner;

public class solution {
  protected static char nonRepeated(String s) {
    int freq[] = new int[26]; // a-z
    for (char c : s.toCharArray()) {
      freq[c - 'a']++; // insert frequency
    }
    for (int i = 0; i < s.length(); i++) {
      if (freq[s.charAt(i) - 'a'] == 1) { // check frequency
        return s.charAt(i); // return character
      }
    }
    return '$'; // if not found return $
  }

  public static void main(String[] args) {
    System.out.print("Enter the string: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    System.out.println(nonRepeated(s));
  }
}
