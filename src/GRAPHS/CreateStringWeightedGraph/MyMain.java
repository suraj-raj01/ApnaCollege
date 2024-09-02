package GRAPHS.CreateStringWeightedGraph;
import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<StringWeighted.Edge>[]graph = new ArrayList[V];
        StringWeighted.createStringWeighted(graph);
        System.out.println("=======================");
        System.out.println("Source\tDest\tWeight");
        System.out.println("=======================");
        for(int i=0; i<graph[0].size(); i++){
            StringWeighted.Edge e = graph[0].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }

        for(int i=0; i<graph[1].size(); i++){
            StringWeighted.Edge e = graph[1].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }

        for(int i=0; i<graph[2].size(); i++){
            StringWeighted.Edge e = graph[2].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }

        for(int i=0; i<graph[3].size(); i++){
            StringWeighted.Edge e = graph[3].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }

        for(int i=0; i<graph[4].size(); i++){
            StringWeighted.Edge e = graph[4].get(i);
            System.out.println(e.src+"\t\t"+e.dest+"\t\t"+e.weight);
        }
    }
}
/*
=======================
Source	Dest	Weight
=======================
A		B		10
A		C		20
B		A		10
B		D		30
C		A		20
C		D		35
D		B		30
D		C		35
D		C		35
D		E		15
E		D		15
*/