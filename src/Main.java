public class Main {

    public static void main(String[] args) {

        Experiment experiment = new Experiment();


        System.out.println("SMALL GRAPH (10 VERTICES)");

        Graph smallGraph = new Graph();

        //add vertices
        for (int i = 1; i <= 10; i++) {

            smallGraph.addVertex(new Vertex(i));
        }

        //add edges
        smallGraph.addEdge(1, 2);
        smallGraph.addEdge(1, 3);

        smallGraph.addEdge(2, 4);
        smallGraph.addEdge(2, 5);

        smallGraph.addEdge(3, 6);
        smallGraph.addEdge(3, 7);

        smallGraph.addEdge(4, 8);

        smallGraph.addEdge(5, 9);

        smallGraph.addEdge(6, 10);

        smallGraph.printGraph();

        //run BFS and DFS experiments
        experiment.runMultipleTests(smallGraph);


        System.out.println();
        System.out.println("MEDIUM GRAPH (30 VERTICES)");

        Graph mediumGraph = new Graph();

        //add vertices
        for (int i = 1; i <= 30; i++) {

            mediumGraph.addVertex(new Vertex(i));
        }

        //add edges
        for (int i = 1; i < 30; i++) {

            //connect consecutive vertices
            mediumGraph.addEdge(i, i + 1);

            //additional connections
            if (i + 2 <= 30) {

                mediumGraph.addEdge(i, i + 2);
            }
        }

        experiment.runMultipleTests(mediumGraph);


        System.out.println();
        System.out.println("LARGE GRAPH (100 VERTICES)");

        Graph largeGraph = new Graph();

        //add vertices
        for (int i = 1; i <= 100; i++) {

            largeGraph.addVertex(new Vertex(i));
        }

        //add edges
        for (int i = 1; i < 100; i++) {

            //connect consecutive vertices
            largeGraph.addEdge(i, i + 1);

            //additional connections
            if (i + 5 <= 100) {

                largeGraph.addEdge(i, i + 5);
            }
        }

        experiment.runMultipleTests(largeGraph);
    }
}