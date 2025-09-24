package graphs.exercices.adj_matrix;

// grafo do tipo: direcionado;

public class CountEdges {
    private int numNodes;
    private Boolean[][] adjMatrix;

    public CountEdges(int numNodes) {
        this.numNodes = numNodes;
        adjMatrix = new Boolean[numNodes][numNodes];

        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                adjMatrix[i][j] = false;
            }
        }
    }

    public void addArc(int nodeOne, int nodeTwo) {

        if(adjMatrix[nodeOne][nodeTwo] || adjMatrix[nodeTwo][nodeOne]) {
            System.out.println("Ja existe um arco aqui.");
            return;
        }

        adjMatrix[nodeOne][nodeTwo] = true;

    }

    public void printGraph() {
        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }

    public int count() {
        int counter = 0;

        for(int i = 0; i < numNodes; i++) {
            for(int j = 0; j < numNodes; j++) {

                if(adjMatrix[i][j] == true) {
                    counter++;
                }

            }
        }

        return counter;

    }

    public static void main(String[] agrs) {
        CountEdges solution = new CountEdges(4);

        solution.addArc(0, 1);
        solution.addArc(1, 2);
        solution.addArc(2, 3);
        solution.addArc(3, 1);
        solution.printGraph();
        int result = solution.count();
        System.out.println(result);
    }
}
