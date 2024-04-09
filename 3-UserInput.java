import java.util.*;

class UserInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectange : ");
        int len = sc.nextInt();

        System.out.print("Enter breadth of the rectange : ");
        int bre = sc.nextInt();

        System.out.println("Area of rectange is " + len * bre);

        sc.close();
    }
}
