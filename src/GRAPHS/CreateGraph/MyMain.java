package GRAPHS.CreateGraph;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<GraphClass.Edge>[]graph = new ArrayList[V];
        GraphClass.createGraph(graph);

        // print neighbours of 0.
        System.out.print("Neighbours of 0's : ");
        for(int i=0; i<graph[0].size(); i++){
            GraphClass.Edge e = graph[0].get(i);
            System.out.print(e.dest+" ");
        }
        // print neighbours of 1.
        System.out.print("\nNeighbours of 1's : ");
        for(int i=0; i<graph[1].size(); i++){
            GraphClass.Edge e = graph[1].get(i);
            System.out.print(e.dest+" ");
        }
        // print neighbours of 2.
        System.out.print("\nNeighbours of 2's : ");
        for(int i=0; i<graph[2].size(); i++){
            GraphClass.Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        // print neighbours of 3.
        System.out.print("\nNeighbours of 3's : ");
        for(int i=0; i<graph[3].size(); i++){
            GraphClass.Edge e = graph[3].get(i);
            System.out.print(e.dest+" ");
        }
    }
}
