import java.util.*;

public class Practice {

    public static class Edge {
        int source;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.dest = d;
            this.source = s;
            this.weight = w;
        }
    }

    public static void main(String args[]) {

        int v = 5;

        ArrayList<Edge>[] samp = new ArrayList[5];

        for(int i=0; i<v; i++){
            samp[i] = new ArrayList<>();
        }

        samp[0].add(new Edge(0 , 1, 5));

        samp[1].add(new Edge(1, 2, 1));
        samp[1].add(new Edge(1, 3, 1));
        samp[1].add(new Edge(1, 0, 5));

        samp[2].add(new Edge(2,3,1));
        samp[2].add(new Edge(2, 1, 1));

        samp[3].add(new Edge(3,1,3));
        samp[3].add(new Edge(3, 2, 3));

        samp[4].add(new Edge(4, 2, 2));
        
        for(int i=0; i<samp[2].size(); i++){
            Edge G = samp[2].get(i);
            System.out.println(G.dest);
        }

    }
}
