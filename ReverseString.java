import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String name="hello world";

        String[] words=name.split(" ");
        StringBuilder ss=new StringBuilder();
        for (int i=0;i< words.length;i++){
            String word=words[i];
            StringBuilder reversed=new StringBuilder(word);
            reversed.reverse();
            ss.append(reversed).append(" ");
        }
        System.out.println(ss);


    }
}
