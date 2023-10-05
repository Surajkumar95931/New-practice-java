import java.util.*;
public class Harshal {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence");
            String str = sc.nextLine();

            System.out.println("Enter word");
            String targetWord = sc.next();

            String words[] = str.split(" ");

            int count=0;
            for (int i = 0; i < words.length; i++) {
                String w1 = words[i];
                if (w1.equals(targetWord)) {
                 count++;
                }
            }
            if (count>0){
                System.out.println("yes avilable "+count+"times");
            }
        }
    }

