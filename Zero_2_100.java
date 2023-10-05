import java.util.*;
public class Zero_2_100 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (seven(i)){
                System.out.printf("%02d --> %d + %d = 7\n", i, i / 10, i % 10, i);

            }
        }
    }
    public static boolean seven(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum==7;
    }
}
