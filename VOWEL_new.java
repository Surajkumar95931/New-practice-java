import java.util.Scanner;

public class VOWEL_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();


        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e'
                    || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u' || name.charAt(i) == 'A'
                    || name.charAt(i) == 'E' || name.charAt(i) == 'I'
                    || name.charAt(i) == 'O'
                    || name.charAt(i) == 'U') {
                continue;
            }else{
                System.out.print(name.charAt(i));
            }

        }
    }
}

