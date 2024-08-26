package GRAPHS.CreatWeightedGraph;

import java.util.ArrayList;

public class WeightedGraph {
    public static class Edge {
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void weightedGraph(ArrayList<Edge>[]graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,3,-1));
        graph[2].add(new Edge(2,1,10));

        graph[1].add(new Edge(1,3,0));
        graph[1].add(new Edge(1,2,10));
    }
}
