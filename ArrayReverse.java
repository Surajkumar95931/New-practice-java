import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 22, 4, 55, 66};
        Arrays.sort(arr);
        System.out.println("Original array");
        print(arr);
        System.out.println("Reverse array");
        reverse(arr);
        print(arr);
        System.out.println("sum of array elements is");
        int s=sum(arr);
        System.out.println(s);
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int sum(int arr[]){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
