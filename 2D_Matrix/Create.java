import java.util.Scanner;


public class Create {

        public static void LargestElement(int user[][], int n) {

        int Smallvalue = Integer.MAX_VALUE;

        for (int i = 0; i < user.length; i++) { // to find the Small Values
            for (int j = 0; j < user.length; j++) {
                if (user[i][j] < Smallvalue) {
                    Smallvalue = user[i][j];
                }

                if (n == user[i][j]) // To find the Values in the 2D array
                {
                    System.out.println("The value are Printed.. At Posion :- " + i + ", " + j);
                }
            }
        }
        System.out.println(Smallvalue);

    }



    public static void main(String args[]) {

        int arr[][] = { { 11, 22, 33, 44 }, { 55, 66, 77, 88 } };

        int user[][] = new int[3][3];

        int number = 44;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < user.length; i++) {
            for (int j = 0; j < user[0].length; j++) {
                user[i][j] = sc.nextInt();
            }
        }

        LargestElement(user, number);

        for (int i = 0; i < user.length; i++) {
            for (int j = 0; j < user[0].length; j++) {
                System.out.print(user[i][j]);
            }
            System.out.println();
        }

    }
}