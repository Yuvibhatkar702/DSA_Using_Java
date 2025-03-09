import javax.print.attribute.HashPrintRequestAttributeSet;

public class DubbleLL {

    public static class Node {
        int data;
        Node next;
        Node pre;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void addFirst(int data) {
        Node new_node = new Node(data);
        Size++;

        if (Head == null) {
            Head = Tail = new_node;
        }

        new_node.next = Head;
        Head.pre = new_node;
        Head = new_node;
    }

    public void addLast(int data) {

        Node new_node = new Node(data);
        Size++;

        if (Head == null) {
            Head = Tail = new_node;
        }

        Tail.next = new_node;
        new_node.pre = Tail;
        Tail = new_node;
    }

    public void addMiddle(int indx, int data) {

        Node new_Node = new Node(data);
        Size++;

        if (Head == null) {
            Head = Tail = new_Node;
        }

        Node temp = Head;
        int i = 0;

        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }

        new_Node.next = temp.next;
        temp.next = new_Node;
        new_Node.pre = temp;

    }

    public int removeFist() {

        if (Head == null) {
            System.out.println("LL is Emapty");
            return Integer.MIN_VALUE;
        } else if (Head.next == null) {
            int temp = Head.data;
            Head = Tail = null;
            return temp;
        } else {
            int temp = Head.data;
            Head = Head.next;
            Head.pre = null;
            
            return temp;
        }

    }

    public void print() {

        Node temp = Head;

        while (temp != null) {
            if (temp == Head) {
                System.out.print("null" + "<-->");
                System.out.print(temp.data + "<-->");
                temp = temp.next;
            }

            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        DubbleLL dll = new DubbleLL();

        dll.addFirst(11);
        dll.addFirst(88);
        dll.addLast(12);
        dll.addLast(13);
        dll.addMiddle(2, 34);
        dll.removeFist();

        dll.print();
    }
}
