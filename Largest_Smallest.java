import java.util.Date;

public class Largest_Smallest {
    public static void main(String[] args) {
        int[] arr = {22, 55, 66, 44, 88, 55, 22, 33, 44, 77, 66, 55, 11, 22, 33, 55, 99};
        int lar = largest(arr);
        System.out.println("largest value is " + lar);

        int sma = smallest(arr);
        System.out.println("smallest value in array" + sma);
        Date d = new Date();
        System.out.println(d);
    }

    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {

                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
