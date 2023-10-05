import java.util.ArrayList;
import java.util.Scanner;

public class INDEX_ADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter in the ArrayList?");
        int n = sc.nextInt();
        ArrayList<Integer> h = new ArrayList<>(n);

        System.out.println("Enter your values in the ArrayList:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            h.add(num);
        }
        System.out.println("Elements in the ArrayList: " + h);

        System.out.println("Do you want to add more (Type Y for YES and N for NO): ");
        char c = sc.next().charAt(0);

        int index = 0;
        int value = 0;

        if (c == 'Y' || c == 'y') {
            System.out.println("Enter the index where you want to add the value:");
            index = sc.nextInt();

            System.out.println("Enter the value you want to add:");
            value = sc.nextInt();

            if (index < 0) {
                System.out.println("Invalid index");
            } else if (index >= h.size()) {
                int numToAdd = index - h.size() + 1;
                for (int i = 0; i <= numToAdd; i++) {
                    h.add(0);
                }
            }
            h.add(value);
        } else {
            if (index >= 0 && index < h.size()) {
                h.set(index, value);
            } else {
                System.out.println("Invalid index");
            }
        }
        System.out.println("Updated ArrayList: " + h);
    }
}
