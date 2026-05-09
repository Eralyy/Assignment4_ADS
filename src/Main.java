public class Main {

    public static void main(String[] args) {

        // Create experiment object
        Experiment experiment = new Experiment();



        // ==================================
        // SMALL GRAPH (10 VERTICES)
        // ==================================

        System.out.println("SMALL GRAPH (10 VERTICES)");

        Graph smallGraph = new Graph();

        // Add vertices
        for (int i = 1; i <= 10; i++) {

            smallGraph.addVertex(new Vertex(i));
        }

        // Add edges
        smallGraph.addEdge(1, 2);
        smallGraph.addEdge(1, 3);

        smallGraph.addEdge(2, 4);
        smallGraph.addEdge(2, 5);

        smallGraph.addEdge(3, 6);
        smallGraph.addEdge(3, 7);

        smallGraph.addEdge(4, 8);

        smallGraph.addEdge(5, 9);

        smallGraph.addEdge(6, 10);

        // Print graph structure
        smallGraph.printGraph();

        // Run BFS and DFS experiments
        experiment.runMultipleTests(smallGraph);



        // ==================================
        // MEDIUM GRAPH (30 VERTICES)
        // ==================================

        System.out.println();
        System.out.println("MEDIUM GRAPH (30 VERTICES)");

        Graph mediumGraph = new Graph();

        // Add vertices
        for (int i = 1; i <= 30; i++) {

            mediumGraph.addVertex(new Vertex(i));
        }

        // Add edges
        for (int i = 1; i < 30; i++) {

            // Connect consecutive vertices
            mediumGraph.addEdge(i, i + 1);

            // Additional connections
            if (i + 2 <= 30) {

                mediumGraph.addEdge(i, i + 2);
            }
        }

        // Run experiments
        experiment.runMultipleTests(mediumGraph);



        // ==================================
        // LARGE GRAPH (100 VERTICES)
        // ==================================

        System.out.println();
        System.out.println("LARGE GRAPH (100 VERTICES)");

        Graph largeGraph = new Graph();

        // Add vertices
        for (int i = 1; i <= 100; i++) {

            largeGraph.addVertex(new Vertex(i));
        }

        // Add edges
        for (int i = 1; i < 100; i++) {

            // Connect consecutive vertices
            largeGraph.addEdge(i, i + 1);

            // Additional connections
            if (i + 5 <= 100) {

                largeGraph.addEdge(i, i + 5);
            }
        }

        // Run experiments
        experiment.runMultipleTests(largeGraph);
    }
}