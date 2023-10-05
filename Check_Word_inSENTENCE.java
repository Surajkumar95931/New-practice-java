import java.util.Scanner;

public class Check_Word_inSENTENCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long sentence:");
        String name = sc.nextLine();

        System.out.println("Enter a word (only one word):");
        String check = sc.next();

        String[] words = name.split(" ");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(check)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("'" + check + "' is available " + count + " times in the sentence.");
        } else {
            System.out.println("'" + check + "' is not available in the sentence.");
        }
    }
}
