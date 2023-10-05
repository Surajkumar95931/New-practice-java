import java.util.*;

public class String_10value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many name u want to add in string array");
        int hum = sc.nextInt();
        String[] name = new String[hum];
        sc.nextLine();

        System.out.println("Enter name here");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        print(name);
        alpha(name);
        System.out.println("your value after calculating alphabetically");
        print(name);
    }
    public static void print(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void alpha(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 1) {
                    String temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
