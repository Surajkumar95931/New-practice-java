import java.util.*;

public class PQ {
    static class classroom implements Comparable<classroom> {
        String name;
        int rank;
        int age;

        public classroom(String name, int rank,int age) {
            this.name = name;
            this.rank = rank;
            this.age=age;
        }

        public int compareTo(classroom s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<classroom> p = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
//        p.add(new classroom("harshal",7));
//        p.add(new classroom("suraj",56));
//        p.add(new classroom("aayush",39));
//        p.add(new classroom("utkarsh",62));
//        p.add(new classroom("prit",12));
        System.out.println("how many value u want to add");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("enter name");
            String name = sc.nextLine();

            System.out.println("enter rank");
            int rank = sc.nextInt();

            System.out.println("enter age");
            int age = sc.nextInt();sc.nextLine();
            classroom c=new classroom(name,rank,age);
            p.add(c);
        }
        while (!p.isEmpty()) {
//            classroom c = p.poll();
//            System.out.println(c.name + ": " + c.rank+": " + c.age);
            while (!p.isEmpty()){
                System.out.println(p.peek().name + " " + p.peek().rank+ " " + p.peek().age);
                p.remove();
            }
        }
    }
}
