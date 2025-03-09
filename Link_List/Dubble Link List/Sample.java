
//import java.util.LinkedList;



public class Sample {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void addFirst(int data) {
        Node new_node = new Node(data);

        if (Head == null) {
            Head = Tail = new_node;
            return;
        }

        new_node.next = Head;

        Head = new_node;
    }

    public void print() {

        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {

        Node new_node = new Node(data);

        if (Head == null) {
            Head = Tail = new_node;
        }

        Tail.next = new_node;

        Tail = new_node;
    }

    public void zikZak() {

        // find Mid
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node Mid = slow;
        Mid.next = null;

        // reverse Secound haf
        Node pre = null;
        Node curr = Mid.next;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        // merge
        Node left = Head; // left Head
        Node rigth = pre; // rigth Head
        Node LN, RN; // to point the next node of the Head Node

        while (left != null && rigth != null) {
            LN = left.next;
            left.next = rigth;

            RN = rigth.next;
            rigth.next = LN;

            left = LN;
            rigth = RN;
        }

        return;
    }

    private Node Mearge(Node left, Node right) {

        Node newLL = new Node(-1);
        Node temp = newLL;
        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }

        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return newLL.next;
    }

    public Node mergeSort(Node Head) {

        // Base Case

        if (Head == null || Head.next == null) {
            return Head;
        }

        // find Mid

        Node Small = Head;
        Node Fast = Head.next;

        while (Fast != null && Fast.next != null) {
            Small = Small.next;
            Fast = Fast.next.next;
        }
        Node Mid = Small;

        // Left and Right MS

       // Node LeftHead = Head;
        Node rightHead = Mid.next;
        Mid.next = null;
        Node newLeft = mergeSort(Head); // recurtion
        Node newRight = mergeSort(rightHead); // recourtion

        // Mearge

        return Mearge(newLeft, newRight);
    }

    public static void main(String args[]) {

        Sample s = new Sample();

        s.addLast(92);
        s.addLast(17);
        s.addLast(32);
        s.addLast(19);
        s.addLast(20);

        s.print();

        //s.zikZak();

        s.Head = s.mergeSort(s.Head);

        s.print();

    }
}