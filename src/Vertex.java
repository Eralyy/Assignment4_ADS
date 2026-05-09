public class Vertex {

    // Unique identifier for the vertex
    private int id;

    // Constructor
    public Vertex(int id) {
        this.id = id;
    }

    // Getter method
    public int getId() {
        return id;
    }

    // Returns readable vertex information
    @Override
    public String toString() {
        return "Vertex " + id;
    }
}