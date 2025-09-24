package graphs.exemples;
import java.util.ArrayList;

public class AdjacencyList {
    private int numVertex;
    private ArrayList<ArrayList<Integer>> adjList;

    public AdjacencyList(int numVertex) {
        this.numVertex = numVertex;
        this.adjList = new ArrayList<>(numVertex);

        for(int i = 0; i < numVertex; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void insertEdge(int origin, int destination) {
        adjList.get(origin).add(destination);
        adjList.get(destination).add(origin);
    }

    public static void main(String[] agrs) {
        AdjacencyList graph = new AdjacencyList(5);

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 4);

        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);

        graph.insertEdge(3, 4);
    }
}
