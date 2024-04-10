import java.util.*;

class IfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println();

        if (a > b) {
            System.out.println("a is greater than b.");
        } else if (a < b) {
            System.out.println("a is smaller than b.");
        } else {
            System.out.println("a is equal to b.");
        }

        sc.close();
    }
}