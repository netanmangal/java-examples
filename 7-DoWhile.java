import java.util.Scanner;

class DoWhile {
		public static void main(String args[]) {
				char wantToCalculateMore = 'Y';
				int a = 0, b = 0;
				String operation = "";
				Scanner sc = new Scanner(System.in);

				do {
						System.out.print("Enter value of a : ");
						a = sc.nextInt();

						System.out.print("Enter value of b : ");
						b = sc.nextInt();

						System.out.println("Valid operations : add / sub / multiply");
						System.out.print("Enter operation you want to perform : ");
						operation = sc.next();

						switch (operation) {
								case "add":
										System.out.println("Result : " + (a + b));
										break;
								case "sub":
										System.out.println("Result : " + (a - b));
										break;
								case "multiply":
										System.out.println("Result : " + (a * b));
										break;
								default:
										System.out.println("Invalid opeartion.");
										break;
						}

						System.out.print("\nDo you want to run the operations again? Y / N : ");
						wantToCalculateMore = sc.next().charAt(0);

				} while(wantToCalculateMore == 'Y' || wantToCalculateMore == 'y');

			sc.close();
		}
}
