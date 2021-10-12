package Queue;



import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<>();
        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        bbqLine.poll(); //takes from line

        System.out.println(bbqLine.peek());

        System.out.println(bbqLine);

        System.out.println("+====================");




        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");

        q.poll();   //A out of line
        q.peek();


        System.out.println(q.size());
        System.out.println(q.contains("G"));
        System.out.println(q.contains("C"));

       // System.out.println(q.toArray()[2]);

        System.out.println(q.poll());


    }
}
