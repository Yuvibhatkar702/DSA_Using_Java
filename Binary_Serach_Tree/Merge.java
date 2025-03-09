
import java.util.*;

public class Merge {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }

    public static void InOrder(Node root, ArrayList<Integer> arr){

        if(root == null){
            return;
        }

        // InOrder Squvence 

        InOrder(root.left, arr);
        arr.add(root.data);
        InOrder(root.right, arr);
    }

    public static Node BalenceBST(ArrayList<Integer> arr, int start, int end){

        if(start > end){
            return null;
        }

        int mid  = (start + end) / 2;

        Node root = new Node(arr.get(mid));

        root.left = BalenceBST(arr, start, mid-1);
        root.right = BalenceBST(arr, mid+1, end);

        return root;

    }


    public static Node Merge(Node root1, Node root2){

        ArrayList<Integer> arr1 = new ArrayList<>();
        InOrder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        InOrder(root2, arr2);

        ArrayList<Integer> Final_List = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            
            if(arr1.get(i) <= arr2.get(j)){
                Final_List.add(arr1.get(i));
                i++;
            }else{
                Final_List.add(arr2.get(j));
                j++;
            }
        }

        while (i<arr1.size()) {
            Final_List.add(arr1.get(i));
            i++;
        }

        while (j<arr2.size()) {
            Final_List.add(arr2.get(j));
            j++;
        }

        return BalenceBST(Final_List, 0, Final_List.size()-1);

    }

    public static void preOrder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = Merge(root1, root2);
        preOrder(root);
    }   
}
