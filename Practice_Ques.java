public class Practice_Ques {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int water = 0;

        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[right.length - 1] = arr[arr.length - 1];
        for (int j = arr.length - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], arr[j]);
        }

        System.out.println("Left Array :- ");
        for (int i = 0; i < left.length; i++) {
            System.out.print(left[i] + ", ");

        }
        System.out.println();

        System.out.println("Right Array :- ");
        for (int j = 0; j < right.length; j++) {
            System.out.print(right[j] + ", ");
        }
        System.out.println();

        System.out.println("Water is :- ");
        for (int i = 0; i < arr.length; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
            System.out.print(water + ", ");
        }

    }

}
