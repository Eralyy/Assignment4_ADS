import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    //stores verticles
    private HashMap<Integer, Vertex> vertices;

    //vertex id -> list of connected vertex ids
    private HashMap<Integer, ArrayList<Integer>> adjacencyList;

    private ArrayList<Edge> edges;

    public Graph() {

        vertices = new HashMap<>();

        adjacencyList = new HashMap<>();

        edges = new ArrayList<>();
    }

    public void addVertex(Vertex v) {

        //prevent duplicates
        if (!vertices.containsKey(v.getId())) {

            vertices.put(v.getId(), v);

            adjacencyList.put(v.getId(), new ArrayList<>());
        }
    }

    //add edge between two vertices
    public void addEdge(int from, int to) {

        //checks if exists
        if (vertices.containsKey(from)
                && vertices.containsKey(to)) {

            //ads neighbor
            adjacencyList.get(from).add(to);

            //creates edge object
            Edge edge = new Edge(vertices.get(from), vertices.get(to));

            edges.add(edge);
        }
    }

    public void printGraph() {

        System.out.println("Graph Structure:");

        for (int vertex : adjacencyList.keySet()) {

            System.out.print(vertex + " -> ");

            System.out.println(adjacencyList.get(vertex));
        }
    }

    //Breadth-First Search (BFS)
    // Explores graph level by level
    public void bfs(int start) {

        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);

        queue.add(start);

        System.out.println("BFS Traversal starting from vertex " + start + ":");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            //visits
            for (int neighbor : adjacencyList.get(current)) {

                //process only unvisited ones
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

    //helper method
    private void dfsRecursive(int current, HashSet<Integer> visited) {

        //marks current vertex as visited
        visited.add(current);

        System.out.print(current + " ");

        //visit neighbors
        for (int neighbor : adjacencyList.get(current)) {

            //process only unvisited neighbors
            if (!visited.contains(neighbor)) {

                dfsRecursive(neighbor, visited);
            }
        }
    }
}