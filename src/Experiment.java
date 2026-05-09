public class Experiment {

    //stores time
    private long bfsTime;

    private long dfsTime;

    //bfs and dfs traversals
    public void runTraversals(Graph g) {

        long bfsStart = System.nanoTime();

        g.bfs(1);

        long bfsEnd = System.nanoTime();

        bfsTime = bfsEnd - bfsStart;


        long dfsStart = System.nanoTime();

        g.dfs(1);

        long dfsEnd = System.nanoTime();

        dfsTime = dfsEnd - dfsStart;
    }

    //experiment for 1 graph
    public void runMultipleTests(Graph g) {

        System.out.println("--------------------------------");

        runTraversals(g);

        printResults();
    }

    public void printResults() {

        System.out.println();
        System.out.println("Performance Results:");

        System.out.println("BFS Time: " + bfsTime + " ns");

        System.out.println("DFS Time: " + dfsTime + " ns");

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