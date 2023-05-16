import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public static void main(String[] args) {
        Queue<Integer> list=new PriorityQueue<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        System.out.println(list);
        System.out.println(list.contains(122));
        System.out.println(list.poll());
        System.out.println(list);


    }
}
