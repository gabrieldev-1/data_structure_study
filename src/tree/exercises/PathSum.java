// Dado um valor target, returne true se existe um caminho da raiz ate uma folha onde a soma dos valores resulte no target;

package tree.exercises;
import java.util.ArrayList;

public class PathSum {
    Node root = null;


    // Logica para adicionar nodes;
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node current, int data) {
        if(current == null) {
            return new Node(data);
        }

        if(data < current.data) {
            current.left = insertRec(current.left, data);

        } else if (data > current.data) {
            current.right = insertRec(current.right, data);

        }

        return current;

    }

    // Logica para imprimir a arvore(usando in-order);
    public void read() {
        ArrayList<Integer> result = new ArrayList<>();
        this.readRec(root, result);

        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        
    }

    private void readRec(Node current, ArrayList<Integer> result) {
        if(current != null) {
            this.readRec(current.left , result);
            result.add(current.data);
            this.readRec(current.right, result);
        }
    }

    // Logica para achar o caminho;
    public Boolean searchPath(int target) {
        return this.searchPathRec(root, target);
    }

    private Boolean searchPathRec(Node current, int target) {
        if (current == null) {
            return false;
        }

        // Se for folha, verifica se a soma bate com o target
        if (current.left == null && current.right == null) {
            return target == current.data;
        }

        // Recursivamente verifica subárvores esquerda e direita
        int newTarget = target - current.data;
        return searchPathRec(current.left, newTarget) || searchPathRec(current.right, newTarget);
    }

    public static void main(String[] agrs) {
        PathSum solution = new PathSum();

        solution.insert(5);
        solution.insert(3);
        solution.insert(1);
        solution.insert(10);
        solution.insert(15);
        solution.insert(7);

        solution.read();

        Boolean result = solution.searchPath(30);
        System.out.println(result);

    }
}
