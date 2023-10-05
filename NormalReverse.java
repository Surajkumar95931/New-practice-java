public class NormalReverse {
    public static void main(String[] args) {
        String name = "hello world!";

        String[] words=name.split(" ");
        StringBuilder ss = new StringBuilder();

        for (int i=0;i< words.length;i++){
            String word=words[i];
            StringBuilder rev=new StringBuilder(word);
            rev.reverse();
            ss.append(rev).append(" ");
        }
        System.out.println(ss);
    }
}
