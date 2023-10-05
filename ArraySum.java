import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        input(arr);
        int res = sum(arr);
        System.out.println("sum "+res);

    }

    public static void input(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + i + " value");
            arr[i] = sc.nextInt();
        }
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
