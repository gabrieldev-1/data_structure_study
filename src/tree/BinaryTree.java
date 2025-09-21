package tree;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;

// BST = "Binary Search Three"
// E uma arvore que armazena os valores menores a esquerda e os maiores a direita;
// Possibilitando um mecanismo de busca mais eficiente;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root = null;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    // funcao recursiva que e chamada para cada sub-arvore;
    private Node insertRec(Node current, int data) {

        // Condicao de parada. Necessaria em um algoritimo recursivo;
        if(current == null) {
            return new Node(data);

        }

        // valida para que lado o current "deve ir";
        if(data < current.data) {
            current.left = insertRec(current.left, data);
        
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);

        }

        return current;

    }

    // Percurso pre-order:
    public ArrayList<Integer> preOrderTranversal() {
        ArrayList<Integer> result = new ArrayList<>();

        this.preOrderTranversalRec(root, result);  // tecnica de 'backtracking'

        return result;
    }

    public void preOrderTranversalRec(Node node, ArrayList<Integer> result) {
        if(node != null) {
            result.add(node.data);
            this.preOrderTranversalRec(node.left, result);
            this.preOrderTranversalRec(node.right, result);
        }
    }

    // Percurso in-order:
    public ArrayList<Integer> inOrderTranversal() {
        ArrayList<Integer> result = new ArrayList<>();

        this.inOrderTranversalRec(root, result);

        return result;
    }

    private void inOrderTranversalRec(Node node, ArrayList<Integer> result) {
        if(node != null) {
            this.inOrderTranversalRec(node.left, result);
            result.add(node.data);
            this.inOrderTranversalRec(node.right, result);
        }
    }

    // Percusro post-order
    public ArrayList<Integer> postOrderTranversal() {
        ArrayList<Integer> result = new ArrayList<>();

        this.postOrderTranversalRec(root, result);

        return result;

    }

    private void postOrderTranversalRec(Node node, ArrayList<Integer> result) {
        if(node != null) {
            this.postOrderTranversalRec(node.left, result);
            this.postOrderTranversalRec(node.right, result);
            result.add(node.data);
        }
    }

    // ==> Algoritmos de busca na arvore <==

    // DFS:
    public void dfs() {
        dfsRecursive(this.root);
    }

    private void dfsRecursive(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.data);

        // visita recursivamente os filhos da esquerda
        dfsRecursive(node.left);

        // visita recursivamente os filhos da direita
        dfsRecursive(node.right);
    }

    // BFS:
    public Boolean bfs(int target) {
        if(this.root == null) {
            return false;
        }

        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(this.root);

        while(!queue.isEmpty()) {
            Node current = queue.poll(); // recupera o primeiro elemento da fila
            if(current.data == target) {
                return true;
            }

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(1);
        bst.insert(10);
        bst.insert(15);
        bst.insert(7);

        System.out.println("==> Algoritimos de busca e leitura <==");

        System.out.println("-------------------------");

        System.out.println("Leitura pre-order:");
        ArrayList<Integer> resultPreOrder = bst.preOrderTranversal();
        for(int i = 0; i < resultPreOrder.size(); i++) {
            System.out.println(resultPreOrder.get(i));
        }

        System.out.println("-------------------------");

        System.out.println("Leitura in-order:");
        ArrayList<Integer> resultInOrder = bst.inOrderTranversal();
        for(int i = 0; i < resultInOrder.size(); i++) {
            System.out.println(resultInOrder.get(i));
        }

        System.out.println("-------------------------");

        System.out.println("Leitura post-order:");
        ArrayList<Integer> resultPostOrder = bst.postOrderTranversal();
        for(int i = 0; i < resultPostOrder.size(); i++) {
            System.out.println(resultPostOrder.get(i));
        }

        System.out.println("-------------------------");
        
        System.out.println("DFS: Depth First Search");
        bst.dfs();
    }
}