// two-sum problem

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.time.ZoneOffset;
import java.time.LocalDateTime;

class Hashmap {
		static int[] doesExists(ArrayList<Integer> arr, int sum) {
				HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

				for(int i = 0; i < arr.size(); i++) {
						int diff = sum - arr.get(i);
						if (hmap.get(diff) != null) {
								return new int[] {hmap.get(diff), i};
						} else {
								hmap.put(arr.get(i), i);
						}
				}

				return new int[] {-1, -1};
		}

		public static void main(String args[]) {
				ArrayList<Integer> arr = new ArrayList<Integer>(20);
				Random rand = new Random(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));

				int sum = rand.nextInt(20);

				for (int i = 0; i < 20; i++) {
						arr.add(rand.nextInt(i * 2 + 2) - 5);
				}

				for (int i = 0; i < arr.size(); i++) {
						System.out.println("Array value at index : " + i + " : is : " + arr.get(i));
				}

				System.out.println("\nSum to find : " + sum);

				int res[] = doesExists(arr, sum);
				System.out.println("\nAnswer : " + res[0] + " , " + res[1]);
		}
}
