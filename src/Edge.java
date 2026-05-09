public class Edge {

    // Starting vertex
    private Vertex source;

    // Ending vertex
    private Vertex destination;

    // Constructor
    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    // Getter for source vertex
    public Vertex getSource() {
        return source;
    }

    // Getter for destination vertex
    public Vertex getDestination() {
        return destination;
    }

    // Returns readable edge information
    @Override
    public String toString() {
        return source.getId() + " -> " + destination.getId();
    }
}