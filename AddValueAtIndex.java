import java.util.*;

public class AddValueAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(" ArrayList: " + a);

        System.out.println("Do you want to add more (Type Y for YES and N for NO): ");
        char c = sc.next().charAt(0);

        if (c == 'Y' || c == 'y') {
            System.out.println("Enter the index where you want to add the value:");
            int index = sc.nextInt();

            System.out.println("Enter the value you want to add:");
            int value = sc.nextInt();

            if (index < 0) {
                System.out.println("Invalid index. The index cannot be negative.");
            } else if (index >= a.size()) {

                int num = index - a.size() ;
                for (int i = 0; i < num; i++) {
                    a.add(0);
                }
                a.add(value);
                System.out.println("new ArrayList: " + a);
            } else {
                a.set(index, value);
                System.out.println("new ArrayList: " + a);
            }
        }

    }
}
