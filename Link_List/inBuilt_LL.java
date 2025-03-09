import java.util.LinkedList;

public class inBuilt_LL {
    public static void main(String args[]){

        LinkedList<Integer> li = new LinkedList<>();
        
        // Do not need to Create a Node USing Srach
        li.addFirst(11);
        li.addFirst(22);
        li.add(33);
        li.add(44);
        li.addLast(55);
        li.remove(); // Remove from Last
        li.removeAll(li); // Remove All Element
        li.removeFirst();
        li.removeLast();

        System.out.println(li);
    }    
}
