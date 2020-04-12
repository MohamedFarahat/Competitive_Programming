package graph;


// A Java Program to detect cycle in an undirected graph

import java.util.*;

    // This class represents a directed graph using adjacency list
// representation
    class IsUndirectedGraphContainsCycle {
        private final int V;
        private final List<List<Integer>> adj;

        public IsUndirectedGraphContainsCycle(int V)
        {
            this.V = V;
            adj = new ArrayList<>(V);

            for (int i = 0; i < V; i++)
                adj.add(new LinkedList<>());
        }

        // Function to add an edge into the graph
        void addEdge(int v,int w) {
            adj.get(v).add(w);
            adj.get(w).add(v);
        }

        // A recursive function that uses visited[] and parent to detect
        // cycle in subgraph reachable from vertex v.
        Boolean isCyclicUtil(int v, boolean []visited, int parent)
        {
            visited[v] = true;

            List<Integer> children = adj.get(v);

            for (Integer a: children) {
                if (a != parent && visited[a]){
                    return true;
                }
                else if(!visited[a]) {
                    return isCyclicUtil(a, visited, v);
                }
            }
            return false;
        }

        // Returns true if the graph contains a cycle, else false.
        Boolean isCyclic()
        {

            boolean visited[] = new boolean[V];
            if (isCyclicUtil(0, visited, -1))
                 return true;
            return false;
        }


        // Driver method to test above methods
        public static void main(String args[])
        {
            // Create a graph given in the above diagram
            IsUndirectedGraphContainsCycle g1 = new IsUndirectedGraphContainsCycle(5);
            g1.addEdge(1, 0);
            g1.addEdge(0, 2);
            g1.addEdge(2, 1);
            g1.addEdge(0, 3);
            g1.addEdge(3, 4);
            if (g1.isCyclic())
                System.out.println("Graph contains cycle");
            else
                System.out.println("Graph doesn't contains cycle");

            IsUndirectedGraphContainsCycle g2 = new IsUndirectedGraphContainsCycle(3);
            g2.addEdge(0, 1);
            g2.addEdge(1, 2);
            if (g2.isCyclic())
                System.out.println("Graph contains cycle");
            else
                System.out.println("Graph doesn't contains cycle");
        }
    }


