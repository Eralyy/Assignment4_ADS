public class Edge {

    // starting
    private Vertex source;

    // ending
    private Vertex destination;

    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return source.getId() + " -> " + destination.getId();
    }
}