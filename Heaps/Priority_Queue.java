
import java.util.*;

public class Priority_Queue{

    // Given the Object to the Priority Queues

    public static class Student implements Comparable<Student>{

        String Name;
        int Id;

        public Student(String name, int id){
            this.Name = name;
            this.Id = id;
        }

        @Override
        public int compareTo(Student s2){
            return this.Id - s2.Id;
        }
    }
    public static void main(String args[]){
        
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Yuvraj", 8)); // O(log n)
        pq.add(new Student("Sunny", 22));
        pq.add(new Student("Akash", 12));
        pq.add(new Student("Rushi", 13));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().Name); //O(1)
            pq.remove(); // O(logn)
        }
    }
}