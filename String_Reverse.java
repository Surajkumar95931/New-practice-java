import java.util.*;
public class String_Reverse {
    public static void main(String[] args) {
        String name="hello world";
        System.out.println("original string-->");
        System.out.println(name);
        String words[]=name.split(" ");
        System.out.println("reversed string-->");
        reverse(words);
    }
    public static void reverse(String arr[]){
        StringBuilder ss=new StringBuilder();
        for (int i=0;i< arr.length;i++){
            String word=arr[i];
            StringBuilder reversed=new StringBuilder(word);
            reversed.reverse();
            ss.append(reversed).append(" ");
        }
        System.out.println(ss);
    }
}
