package GRAPHS.BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createBFS(ArrayList<Edge>[]graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void bfs(ArrayList<Edge>[]graph,int V){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[V];
        q.offer(0);
        // q.add(0);
        while(!q.isEmpty()){
            //int curr = q.remove();
            int curr = q.poll();
            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.offer(e.dest);
                    //q.add(e.dest);
                }
            }
        }
    }
}
