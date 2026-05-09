public class Experiment {

    // Stores BFS execution time
    private long bfsTime;

    // Stores DFS execution time
    private long dfsTime;

    // Run BFS and DFS traversals
    public void runTraversals(Graph g) {

        // Measure BFS execution time
        long bfsStart = System.nanoTime();

        g.bfs(1);

        long bfsEnd = System.nanoTime();

        bfsTime = bfsEnd - bfsStart;



        // Measure DFS execution time
        long dfsStart = System.nanoTime();

        g.dfs(1);

        long dfsEnd = System.nanoTime();

        dfsTime = dfsEnd - dfsStart;
    }

    // Run experiment for one graph
    public void runMultipleTests(Graph g) {

        System.out.println("--------------------------------");

        runTraversals(g);

        printResults();
    }

    // Print performance comparison
    public void printResults() {

        System.out.println();
        System.out.println("Performance Results:");

        System.out.println("BFS Time: " + bfsTime + " ns");

        System.out.println("DFS Time: " + dfsTime + " ns");

        // Compare execution times
        if (bfsTime < dfsTime) {

            System.out.println("BFS was faster in this experiment.");

        } else if (dfsTime < bfsTime) {

            System.out.println("DFS was faster in this experiment.");

        } else {

            System.out.println("Both algorithms had similar execution time.");
        }

        System.out.println("--------------------------------");
    }
}