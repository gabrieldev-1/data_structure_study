package graphs.exercices.adj_list;
import java.util.ArrayList;

public class VertexDegree {
    private int numVertex;
    private ArrayList<ArrayList<Integer>> adjList;

    public VertexDegree(int numVertex) {
        this.numVertex = numVertex;
        this.adjList = new ArrayList<>(numVertex);

        for(int j = 0; j < numVertex; j++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void insertEdge(int origin, int destination) {
        adjList.get(origin).add(destination);
        adjList.get(destination).add(origin);
    }

    public int calcDegree(int vertex) {
        return adjList.get(vertex).size();

    }

    public static void main(String[] agrs) {
        VertexDegree solution = new VertexDegree(4);
        
        solution.insertEdge(0, 1);
        solution.insertEdge(1, 2);
        solution.insertEdge(1, 3);

        int degree = solution.calcDegree(1);
        System.out.println(degree);
    }

}
