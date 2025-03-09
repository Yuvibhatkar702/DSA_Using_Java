public class Part_2 {
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

    public static boolean Check_Cycle_from_or_not() {
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void Remove_cycle() {

        Node fast = Head;
        Node slow = Head;

        boolean Check = false;
        
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
           

            if (fast == slow) {
                Check = true;
                break;
            }

            if (Check == false) {
                return;
            }
        }

        slow = Head;
        Node pre = null;

        while (slow != fast) {
            slow = slow.next;
            pre = fast;
            fast = fast.next;
        }

        pre.next = null;
    }

    public static void main(String args[]) {

        // Head = new Node(22);
        // Head.next = new Node(33);
        // Head.next.next = new Node(44);
        // Head.next.next.next = Head;
        // // 22->33->44->null

        Head = new Node(22);
        Node temp = new Node(99);
        Head.next =  temp;
        Head.next.next = new Node(44);
        Head.next.next.next = temp;
        
        

        System.out.println(Check_Cycle_from_or_not());
        Remove_cycle();
        System.out.println(Check_Cycle_from_or_not());

        // Node temp = Head;

        // while (temp != null) {
        //     System.out.print(temp.data + "->");
        //     temp = temp.next;
        // }
        // System.out.println("null");
    }

}
