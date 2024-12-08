
// Palindrome Sentence
import java.util.Scanner;

public class solution {
  public static boolean isPalindrome(String s) {
    StringBuilder sent = new StringBuilder(); // StringBuilder is formed
    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) { // checks if the character is a letter or a digit
        sent.append(Character.toLowerCase(c)); // append the character by converting it to lowercase
      }
    }
    StringBuilder rev = new StringBuilder(sent.toString()); // new string builder for reversing
    return sent.toString().equals(rev.reverse().toString()); // returns true if the string is a palindrome
  }

  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    System.out.println("Palindrome: " + isPalindrome(s));
  }
}