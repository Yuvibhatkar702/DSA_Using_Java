import java.util.*;

public class Array_To_BTS {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void PreOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static Node Convert(int arr[], int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = Convert(arr, start, mid - 1);
        root.right = Convert(arr, mid + 1, end);

        return root;
    }

    public static Node Balance(ArrayList<Integer> arr, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = Balance(arr, start, mid - 1);
        root.right = Balance(arr, mid + 1, end);
        return root;
    }

    public static void InOrder(Node root, ArrayList<Integer> arrList) {

        if (root == null) {
            return;
        }

        InOrder(root.left, arrList);
        arrList.add(root.data);
        InOrder(root.right, arrList);

    }

    public static Node Balance_Tree(Node root) {

        if (root == null) {
            return null;
        }
        
        // InOrder
        ArrayList arrList = new ArrayList<>();
        InOrder(root, arrList);
        

        // Sorted --> Balance

        root = Balance(arrList, 0, arrList.size()-1);

        return root;

    }

    public static void main(String args[]) {

        // int arr[] = {3,5,6,8,10,11,12};

        // int start = 0;
        // int end = arr.length-1;

        // Node root = Convert(arr, start, end);

        // PreOrder(root);

        Node root = new Node(8);

        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right = new Node(12);

        root = Balance_Tree(root);
        PreOrder(root);
    }
}
