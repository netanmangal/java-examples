import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class Linkedlist {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            ll.addLast(rand.nextInt(i * 10 + 5));
        }

        Iterator<Integer> ite = ll.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
