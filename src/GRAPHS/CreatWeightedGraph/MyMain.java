package GRAPHS.CreatWeightedGraph;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<WeightedGraph.Edge>[] graph = new ArrayList[V];
        WeightedGraph.weightedGraph(graph);
        System.out.println("=======================");
        System.out.println("Source\tDest\tWeight");
        System.out.println("=======================");
        for(int i=0; i<graph[2].size(); i++){
            WeightedGraph.Edge e = graph[2].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }
        for(int i=0; i<graph[1].size(); i++){
            WeightedGraph.Edge e = graph[1].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }
        System.out.println("=======================");
    }
}
