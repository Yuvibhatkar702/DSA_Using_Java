import java.util.*;

public class Lecture_14 {

    public static int Sum(int A, int B) {
        return A + B;
    }

    public static void Substrctor(int A, int B) {
        System.out.println("The Subsraction is :- " + (A - B));
    }

    public static void Swap(int A, int B) {
        int temp;

        temp = A;
        A = B;
        B = temp;

        System.out.println("The value of A is :- " + A);
        System.out.println("Values of B is :- " + B);
    }

    public static void Factorial(int a) {
        int f = 1;

        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        System.out.println("The Factorial is :- " + f);
    }

    public static int Fact(int q) {
        int f = 1;

        for (int i = 1; i <= q; i++) {
            f = f * i;
        }
        return f;
    }

    // Methode Overloding with diffrent Parameter and Diffrent data-types
    public static double AddTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int AddTwoNumbers(int a, int b, int c) // Methode Overloding
    {
        return a + b + c;
    }

    public static boolean isPrime(int a) {
        boolean isPrime = true;

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void Prime_in_range(int n) {
        isPrime(n);
    }

    public static void binTodeci(int n) {
        int deci = 0;
        int pow = 0;

        while (n > 0) {
            int LastDigit = n % 10;
            deci = LastDigit * (int) (Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
    }

    public class Sample { // Home Works Problem

        public static int AddInteger(int a) {
            int LastDigit;
            int Sum = 0;

            while (a > 0) {
                LastDigit = a % 10;
                Sum = LastDigit + Sum;
                a = a / 10;
            }
            return Sum;
        }

        public static int Avrage(int a, int b, int c) {
            return a + b + c / 3;
        }

        public static void main(String args[]) {
            
            Scanner sc = new Scanner(System.in);

            // System.out.println("Enter the Values :-");
            // int a = sc.nextInt();
            // int b = sc.nextInt();

            // int has = Sum(a,b);
            // System.out.println("The Addition is :- " + has);

            // Substrctor(a,b);

            // // Swap Values
            // Swap(a,b);

            // Factorial of the numbers.

            // System.out.println("Enter the number :- ");
            // int fact = sc.nextInt();
            // Factorial(fact);

            // System.out.println("Enter the st Value : -");
            // int A = sc.nextInt();
            // int First = Fact(A);

            // System.out.println("Enter the Secound Value :- ");
            // int B = sc.nextInt();
            // int Secound = Fact(B);

            // int Trird = Fact(A-B);

            // int Binomial = First / (Secound*Trird);
            // System.out.println("The Binomial is :- " + Binomial);

            // System.out.println(AddTwoNumbers(5555, 755));
            // System.out.println(AddTwoNumbers(8, 4, 3));

            // System.out.println(isPrime(9));

            // System.out.print("Enter The Number:- ");
            // int N = sc.nextInt();

            // Prime_in_range(N);

            int h = Avrage(5, 6, 7);
            System.out.println(h);

            int k = AddInteger(555);
            System.out.print(k);

        }

    }
}
