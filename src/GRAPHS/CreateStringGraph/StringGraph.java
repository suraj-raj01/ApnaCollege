package GRAPHS.CreateStringGraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringGraph {
    static class Edge {
        String src;
        String dest;
        public Edge(String fname,String lname){
            this.src = fname;
            this.dest = lname;
        }
    }
    public static void createStringGraph(ArrayList<Edge>[]graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge("A","B"));
        graph[0].add(new Edge("A","C"));

        graph[1].add(new Edge("B","A"));
        graph[1].add(new Edge("B","D"));

        graph[2].add(new Edge("C","A"));
        graph[2].add(new Edge("C","D"));

        graph[3].add(new Edge("D","B"));
        graph[3].add(new Edge("D","C"));
        graph[3].add(new Edge("D","E"));

        graph[4].add(new Edge("E","D"));
    }
}
