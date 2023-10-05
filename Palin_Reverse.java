import org.w3c.dom.ls.LSOutput;

public class Palin_Reverse {
    public static void main(String[] args) {
        int n=12124;
        if (palindrome(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        int result=Reverse(n);
        System.out.println("reverse value of "+n+" is "+result);
    }
    public static boolean palindrome(int num){
        int check=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return check==rev;
    }
    public static int Reverse(int num){
       int reverse=0;
       while(num!=0){
           int rem=num%10;
           reverse=reverse*10+rem;
           num=num/10;
       }
       return reverse;
    }
}
