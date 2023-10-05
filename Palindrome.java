public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println("original number");
        System.out.println(num);
        if (palindrome(num)) {
            System.out.println("yes number is palindrome");
        } else {
            System.out.println("no");
        }
        int ab=reverse(num);
        System.out.println("reverse of a palindrome");
        System.out.println(ab);
        int result=sum(num,reverse(num));
        System.out.println("sumof num and reverse"+result);
    }
    public static boolean palindrome(int num) {
        int on = num;
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return on == reverse;
    }
    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return  reverse;
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
