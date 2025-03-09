import java.util.*;


// Create a List Using Adjacency Methode.

public class Create {

    public static class Edge {
        int src;
        int des;
        int weig;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.weig = w;
        }
    }




    public static void main(String args[]){

        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v]; // Convert to the null to Empty Array List

        for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3 , 3));
        graph[1].add(new Edge(1, 0, 5));

        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2, 1, 1));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3, 2, 3));

        graph[4].add(new Edge(4, 2, 2));
        
        for(int i=0; i<graph[2].size(); i++){
            Edge E = graph[2].get(i);
            System.out.println(E.weig);
        }


    }   
}
