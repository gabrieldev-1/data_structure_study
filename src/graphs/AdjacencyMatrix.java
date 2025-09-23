// Representacao de um grafo nao direcionado;

package graphs;

public class AdjacencyMatrix {
    private int numNodes;
    private Boolean[][] adjMatrix;

    public AdjacencyMatrix(int numNodes) {
        this.numNodes = numNodes;
        adjMatrix = new Boolean[numNodes][numNodes];

        // Inicializa todas as posicoes da matriz como 'false';
        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                adjMatrix[i][j] = false;
            }
        }
    }

    public void addEdge(int nodeOne, int nodeTwo) {

        // Por ser um grafo nao direcionado, tanto a 'ida' como a 'volta' recebem '1'
        adjMatrix[nodeOne][nodeTwo] = true;
        adjMatrix[nodeTwo][nodeOne] = true;
    }

    public void removeEdge(int nodeOne, int nodeTwo) {
        if(adjMatrix[nodeOne][nodeTwo] = false) {
            System.out.println("Esses nodes nao possuem uma vertice entre eles");
            return;
        }

        adjMatrix[nodeOne][nodeTwo] = false;
        adjMatrix[nodeTwo][nodeOne] = false;
    }

    public void printGraph() {
        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " "); // Converte os valores booleanos em '1' e '0';
            }
            System.out.println();
        }
    }

    public static void main(String[] agrs) {
        AdjacencyMatrix matrix = new AdjacencyMatrix(5);

        matrix.addEdge(0, 1);
        matrix.addEdge(0, 2);
        matrix.addEdge(0, 4);

        matrix.addEdge(1, 2);
        matrix.addEdge(1, 3);
        
        matrix.addEdge(2, 3);
        matrix.addEdge(2, 4);

        matrix.printGraph();
    }
}
