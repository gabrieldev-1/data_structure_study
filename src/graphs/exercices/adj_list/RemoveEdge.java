package graphs.exercices.adj_list;

import java.util.ArrayList;

public class RemoveEdge {
    private int numVertex;
    private ArrayList<ArrayList<Integer>> adjList;

    public RemoveEdge(int numVertex) {
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

    public void removeEdge(int origin, int destination) {
        
    }
}
