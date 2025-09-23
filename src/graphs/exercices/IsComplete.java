package graphs.exercices;

public class IsComplete {
    private int numVertex;
    private Boolean[][] adjMatrix;

    public IsComplete(int numVertex) {
        this.numVertex = numVertex;
        adjMatrix = new Boolean[numVertex][numVertex];

        for(int i = 0; i < numVertex; i++) {
            for(int j = 0; j < numVertex; j++) {
                adjMatrix[i][j] = false;
            }
        }
    }

    public void addEdge(int vertexOne, int vertexTwo) {
        adjMatrix[vertexOne][vertexTwo] = true;
        adjMatrix[vertexTwo][vertexOne] = true;
    }

    public void printMatrix() {
        for(int i = 0; i < numVertex; i++) {
            for(int j = 0; j < numVertex; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }

            System.out.println();

        }
    }

    public Boolean isComplete() {
        for(int i = 0; i < numVertex; i++) {
            int numEdges = 0;
            
            for(int j = 0; j < numVertex; j++) {
                if(adjMatrix[i][j]) {
                    numEdges++;
                }
            }

            if(numEdges != (numVertex - 1)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsComplete solution = new IsComplete(5);

        solution.addEdge(0, 1);
        solution.addEdge(0, 2);
        solution.addEdge(0, 3);
        solution.addEdge(0, 4);

        solution.addEdge(1, 0);
        solution.addEdge(1, 2);
        solution.addEdge(1, 4);
        
        solution.addEdge(2, 0);
        solution.addEdge(2, 1);
        solution.addEdge(2, 3);
        solution.addEdge(2, 4);

        solution.addEdge(3, 0);
        solution.addEdge(3, 2);
        solution.addEdge(3, 4);
        
        solution.addEdge(4, 0);
        solution.addEdge(4, 1);
        solution.addEdge(4, 2);
        solution.addEdge(4, 3);


        solution.printMatrix();
        Boolean result = solution.isComplete();
        System.out.println(result);
    }
}
