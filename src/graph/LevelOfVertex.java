package graph;// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class LevelOfVertex {
    private int V; // No. of vertices
    private List<List<Integer>> adj; //Adjacency Lists

    // Constructor
    LevelOfVertex(int v)
    {
        V = v;
        adj = new ArrayList<>(v);
        for (int i=0; i<v; ++i)
            adj.add( new LinkedList<>());
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    // prints BFS traversal from a given source s
    int[] indicateLevel(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
        int level[] = new int[V];
        LinkedList<Integer> queue = new LinkedList<>();
        level[s] = 0;
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()){
            s = queue.poll();
            Iterator<Integer> iterator = adj.get(s).listIterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                    level[n] = level[s] +1;
                }
            }
        }

        return level;
    }

    // Driver method to
    public static void main(String args[])
    {
        int v = 5;
        LevelOfVertex g = new LevelOfVertex(v);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
       // g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Level of Every Node "+
                "(starting from vertex 2)");

       int [] level =  g.indicateLevel(2);
       for(int i = 0;i< v; i++){
           System.out.println(i +"  => level: " + level[i]);
       }
    }
}

