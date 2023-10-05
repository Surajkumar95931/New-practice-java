import java.util.Scanner;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first string");
        String first = sc.nextLine();

        System.out.println("Enter your Second string");
        String second = sc.nextLine();

        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();
        if (first.length() != second.length()) {
            System.out.println("String is not anagram");
            return;
        }
        char[] charArr1 = first.toCharArray();
        char[] charArr2 = second.toCharArray();


        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if (Arrays.equals(charArr1, charArr2)) {
            System.out.println("string is anagram");
        } else {
            System.out.println("string is not anagram");
        }

    }
}
