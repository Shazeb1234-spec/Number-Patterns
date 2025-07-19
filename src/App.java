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

            //0, 1, 1, 2, 3, 5, 8, ,13 

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
                int Prim = scanner.nextInt();
              
                //1, 3, 5, 7, 11, , 13, 17, 19, 23

                
            }

    }
}
