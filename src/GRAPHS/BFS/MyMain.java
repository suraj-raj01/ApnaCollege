package GRAPHS.BFS;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        int  V = 7;
        ArrayList<BFS.Edge>[]graph = new ArrayList[V];
        BFS.createBFS(graph);
        BFS.bfs(graph,V);
    }
}
/*
0 1 2 3 4 5 6
*/