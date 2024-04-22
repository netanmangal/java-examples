import java.util.Random;
import java.util.HashSet;
import java.time.ZoneOffset;
import java.time.LocalDateTime;

class UsingHashset {
		public static void main(String args[]) {
				Random rand = new Random(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));

				HashSet<Integer> hset = new HashSet<Integer>();
				for (int i = 0; i < 20; i++) {
						hset.add(rand.nextInt(i * 1 + 5));
				}

				System.out.println("Out of 20 iterations, unique values : " + hset.size() + " , duplicate values : " + (20 - hset.size()));

				System.out.println("\nUnique values : \n");
				for (int v : hset) {
						System.out.print(" " + v + " ");
				}
		}
}
