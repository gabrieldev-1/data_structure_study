package graphs.exercices;

// grafo do tipo: nao direcionado;

public class CalcDegree {
    private int numNodes;
    private Boolean[][] adjMatrix;

    public CalcDegree(int numNodes) {
        this.numNodes = numNodes;
        adjMatrix = new Boolean[numNodes][numNodes];

        // Adiciona 'false' a todas as posicoes iniciais da matriz;
        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                adjMatrix[i][j] = false;
            }
        }
    }

    public void addEdge(int nodeOne, int nodeTwo) {
        if(adjMatrix[nodeOne][nodeTwo]) {
            System.out.println("ja existe uma aresta aqui.");
            return;
        }

        adjMatrix[nodeOne][nodeTwo] = true;
        adjMatrix[nodeTwo][nodeOne] = true;

    }

    public void printMatrix() {
        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }

            System.out.println();

        }
    }

    public int calc(int node) {
        int result = 0;

        for(int j = 0; j < numNodes; j++) {
            Boolean accEdge = adjMatrix[node][j];

            if(accEdge) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] agrs) {
        CalcDegree solution = new CalcDegree(5);

        solution.addEdge(0, 1);
        solution.addEdge(0, 2);
        solution.addEdge(0, 4);

        solution.addEdge(1, 2);
        solution.addEdge(1, 3);
        
        solution.addEdge(2, 3);
        solution.addEdge(2, 4);

        solution.printMatrix();

        int result = solution.calc(2);
        System.out.println(result);

    }

}
