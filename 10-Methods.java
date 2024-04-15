import java.util.Scanner;

class Methods {
    static int fibonacci(int n, int memoize[]) {
        if (n == 0 || n == 1 || n == 2) return 1;
        if (memoize[n] != 0) return memoize[n];

        int ans = fibonacci(n - 1, memoize) + fibonacci(n - 2, memoize);
        memoize[n] = ans;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n to get nth fibonacci number : ");
        int n = sc.nextInt();

        int memoize[] = new int[n + 1];

        int ans = fibonacci(n, memoize);
        System.out.println("nth fibonacci number is : " + ans);

        sc.close();
    }
}
