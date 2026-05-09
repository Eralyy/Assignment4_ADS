import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    // Stores all vertices
    private HashMap<Integer, Vertex> vertices;

    // Adjacency list representation
    // vertex id -> list of connected vertex ids
    private HashMap<Integer, ArrayList<Integer>> adjacencyList;

    // Stores all edges
    private ArrayList<Edge> edges;

    // Constructor
    public Graph() {

        vertices = new HashMap<>();

        adjacencyList = new HashMap<>();

        edges = new ArrayList<>();
    }

    // Add a new vertex
    public void addVertex(Vertex v) {

        // Prevent duplicate vertices
        if (!vertices.containsKey(v.getId())) {

            vertices.put(v.getId(), v);

            adjacencyList.put(v.getId(), new ArrayList<>());
        }
    }

    // Add edge between two vertices
    public void addEdge(int from, int to) {

        // Check if both vertices exist
        if (vertices.containsKey(from)
                && vertices.containsKey(to)) {

            // Add neighbor into adjacency list
            adjacencyList.get(from).add(to);

            // Create edge object
            Edge edge = new Edge(vertices.get(from), vertices.get(to));

            // Store edge
            edges.add(edge);
        }
    }

    // Print graph structure
    public void printGraph() {

        System.out.println("Graph Structure:");

        for (int vertex : adjacencyList.keySet()) {

            System.out.print(vertex + " -> ");

            System.out.println(adjacencyList.get(vertex));
        }
    }

    // Breadth-First Search (BFS)
    // Explores graph level-by-level
    public void bfs(int start) {

        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);

        queue.add(start);

        System.out.println("BFS Traversal starting from vertex " + start + ":");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            // Visit neighbors
            for (int neighbor : adjacencyList.get(current)) {

                // Process only unvisited neighbors
                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);

                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // Depth-First Search (DFS)
    // Explores graph depth-first using recursion
    public void dfs(int start) {

        HashSet<Integer> visited = new HashSet<>();

        System.out.println("DFS Traversal starting from vertex " + start + ":");

        dfsRecursive(start, visited);

        System.out.println();
    }

    // Recursive DFS helper method
    private void dfsRecursive(int current, HashSet<Integer> visited) {

        // Mark current vertex as visited
        visited.add(current);

        // Print current vertex
        System.out.print(current + " ");

        // Visit neighbors
        for (int neighbor : adjacencyList.get(current)) {

            // Process only unvisited neighbors
            if (!visited.contains(neighbor)) {

                dfsRecursive(neighbor, visited);
            }
        }
    }
}