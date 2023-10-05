import java.util.Scanner;

public class Vowels_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a string: ");
        String name = sc.nextLine();

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toUpperCase(name.charAt(i));
            switch (ch) {
                case 'A':
                    countA++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'O':
                    countO++;
                    break;
                case 'U':
                    countU++;
                    break;
            }
        }
        System.out.println("Number of 'A's: " + countA);
        System.out.println("Number of 'E's: " + countE);
        System.out.println("Number of 'I's: " + countI);
        System.out.println("Number of 'O's: " + countO);
        System.out.println("Number of 'U's: " + countU);
    }
}
