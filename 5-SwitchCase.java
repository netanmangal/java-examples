import java.util.Scanner;

class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Operations : add / sub / multiply");
        System.out.print("Enter operation to perform : ");
        String opr = sc.next();

        switch (opr) {
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
                System.out.println("Invalid operation. Try again!");
                break;
        }

        sc.close();
    }
}