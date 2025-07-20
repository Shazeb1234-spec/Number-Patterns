import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Number Pattern Generator :D");
        System.out.println("Choose a Pattern To Generate");
        System.out.println("1. Fibonacci Series");
        System.out.println("2. Prime Numbers");
        System.out.println("Enter Your Choice 1 or 2 :)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter How many Numbers you want in the Fibonacci Series");
            int fib = scanner.nextInt();

            // 0, 1, 1, 2, 3, 5, 8, ,13

            int prevf = 0;
            int currf = 1;
            int nextnumf = 1;

            System.out.println(prevf);
            System.out.println(currf);

            for (int i = 0; i < fib; i++) {

                nextnumf = prevf + currf;

                prevf = currf;
                currf = nextnumf;

                System.out.println(nextnumf);

            }
        }

        if (choice == 2) {
            System.out.println("Enter How many numbers you want in the Prime numbers sequence");
            int num1 = scanner.nextInt();

            // 1, 3, 5, 7, 11, , 13, 17, 19, 23-- Prime Numbers//

            // if (num1 % 2 == 1) {
            // System.out.println(1);
            // }

            for (int i = 1; i < num1; i++) {

                boolean prime = isPrime(i);

                if (prime == true) {

                    System.out.println(i);

                }
            }

        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
