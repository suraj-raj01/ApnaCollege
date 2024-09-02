package GRAPHS.CreateStringWeightedGraph;
import java.util.ArrayList;

public class StringWeighted {
    public static class Edge{
        String src;
        String dest;
        int weight;
        public Edge(String src, String dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void createStringWeighted(ArrayList<Edge>[]graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge("A","B",10));
        graph[0].add(new Edge("A","C",20));

        graph[1].add(new Edge("B","A",10));
        graph[1].add(new Edge("B","D",30));

        graph[2].add(new Edge("C","A",20));
        graph[2].add(new Edge("C","D",35));

        graph[3].add(new Edge("D","B",30));
        graph[3].add(new Edge("D","C",35));
        graph[3].add(new Edge("D","C",35));
        graph[3].add(new Edge("D","E",15));

        graph[4].add(new Edge("E","D",15));
    }
}
