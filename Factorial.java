public class Factorial {
    public static void main(String[] args) {
        int a = fact(4);
        System.out.println(a);

        int fac=1;
        for (int i=1;i<=6;i++){
            fac=fac*i;
        }
        System.out.println("answer is "+fac);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
