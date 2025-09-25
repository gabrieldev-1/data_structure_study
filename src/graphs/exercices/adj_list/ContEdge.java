package graphs.exercices.adj_list;
import java.util.ArrayList;

public class ContEdge {
    private int numVertex;
    private ArrayList<ArrayList<Integer>> adjList;

    public ContEdge(int numVertex) {
        this.numVertex = numVertex;
        this.adjList = new ArrayList<>(numVertex);

        // adiciona um array a cada indice do array 'adjList';
        for(int i = 0; i < numVertex; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void insertEdge(int origin, int destination) {
        adjList.get(origin).add(destination);
        adjList.get(destination).add(origin);
    }

    public int count() {
        int result = 0;

        for(int i = 0; i < adjList.size(); i++) {
            result += adjList.get(i).size();
        }

        return result / 2;
    }

    public static void main(String[] agrs) {
        ContEdge solution = new ContEdge(5);

        solution.insertEdge(0, 1);
        solution.insertEdge(1, 2);
        solution.insertEdge(1, 3);

        int result = solution.count();
        System.out.println(result);
    }

}
