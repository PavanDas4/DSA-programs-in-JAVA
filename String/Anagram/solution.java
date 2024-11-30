
// Anagram
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) { // Check if the lengths of the strings are equal
      return false;
    }
    Map<Character, Integer> map = new HashMap<>(); // Create a HashMap to store character frequencies
    for (char c : s1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1); // Increment the frequency of each character
    }
    for (char c : s2.toCharArray()) {
      if (!map.containsKey(c)) { // Check if the character is not present in the first string
        return false;
      }
      map.put(c, map.get(c) - 1); // Decrement the frequency of the character
      if (map.get(c) < 0) { // Check if the frequency becomes negative
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1, s2;
    System.out.print("Enter the first string: ");
    s1 = sc.nextLine();
    System.out.print("Enter the second string: ");
    s2 = sc.nextLine();
    sc.close();
    if (isAnagram(s1, s2)) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }
  }
}
