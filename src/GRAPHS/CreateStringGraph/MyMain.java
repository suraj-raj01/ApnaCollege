package GRAPHS.CreateStringGraph;
import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        int V=5;
        ArrayList<StringGraph.Edge>[]graph = new ArrayList[V];
        StringGraph.createStringGraph(graph);
        System.out.print("Neighbours of A : [ ");
        for(int i=0; i<graph[0].size(); i++){
            StringGraph.Edge e = graph[0].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println("]");
        System.out.print("Neighbours of B : [ ");
        for(int i=0; i<graph[1].size(); i++){
            StringGraph.Edge e = graph[1].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println("]");
        System.out.print("Neighbours of C : [ ");
        for(int i=0; i<graph[2].size(); i++){
            StringGraph.Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println("]");
        System.out.print("Neighbours of D : [ ");
        for(int i=0; i<graph[3].size(); i++){
            StringGraph.Edge e = graph[3].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println("]");
        System.out.print("Neighbours of E : [ ");
        for(int i=0; i<graph[4].size(); i++){
            StringGraph.Edge e = graph[4].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println("]");
    }
}

/*
Neighbours of A : [ B C ]
Neighbours of B : [ A D ]
Neighbours of C : [ A D ]
Neighbours of D : [ B C E ]
Neighbours of E : [ D ]
*/