import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;

class Sort {
    public static void main(String args[]) {
        ArrayList<Integer> ai = new ArrayList<Integer>();

        Random rand = new Random();
        rand.setSeed(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));

        for (int i = 0; i < 10; i++) {
            ai.add(rand.nextInt(i * 100 + 5));
        }

        System.out.println("--- Before sorting ---");
        for (Integer i : ai) {
            System.out.println(i);
        }

        Collections.sort(ai);

        System.out.println("\n\n--- After sorting ---");
        for (Integer i : ai) {
            System.out.println(i);
        }
    }
}
