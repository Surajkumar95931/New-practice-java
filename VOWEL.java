
import java.util.*;
    public class VOWEL {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = sc.nextLine();

            String result = name.replaceAll("[aeiouAEIOU]", "");
            System.out.println("Name without vowels: " + result);


            System.out.println("Enter an integer:");
            int number = sc.nextInt();


            int even = Integer.parseInt(Integer.toString(number).replaceAll("[02468]", ""));
            System.out.println("Number without even digits: " + even);


            System.out.println("Enter an integer:");
            int num = sc.nextInt();


            int odd = Integer.parseInt(Integer.toString(num).replaceAll("[13579]", ""));
            System.out.println("Number without odd digits: " + odd);
        }
    }


