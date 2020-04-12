package graph;// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class BFSDirectedGraph {
    private int V; // No. of vertices
    private List<List<Integer>> adj; //Adjacency Lists

    // Constructor
    BFSDirectedGraph(int v)
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
    }

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()){
             s = queue.poll();
             System.out.print(s+ " ");
            Iterator<Integer> iterator = adj.get(s).listIterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }

    // Driver method to
    public static void main(String args[])
    {
        BFSDirectedGraph g = new BFSDirectedGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}

