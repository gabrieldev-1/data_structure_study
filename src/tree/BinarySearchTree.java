package tree;

// BST = "Binary Search Three"
// E uma arvore que armazena os valores menores a esquerda e os maiores a direita;
// Possibilitando um mecanismo de busca mais eficiente;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;

    }
}

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;

    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);

        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);

        } else if(value > current.value) {
            current.right = insertRecursive(current.right, value);

        }

        return current;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);

    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        if (value < current.value) {
            return searchRecursive(current.left, value);

        } else {
            return searchRecursive(current.right, value);

        }
    }
        /**
     * Exibe a árvore em ordem (left -> root -> right).
     */
    public void inorderTraversal() {
        inorderRecursive(root);
        System.out.println();
    }
    
    private void inorderRecursive(Node node) {
        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.value + " ");
            inorderRecursive(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserindo elementos na árvore
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Árvore em ordem (valores crescentes):");
        bst.inorderTraversal(); // Saída esperada: 20 30 40 50 60 70 80 

        // Verificando a existência de elementos
        System.out.println("\nBuscando pelo valor 40: " + bst.search(40)); // true
        System.out.println("Buscando pelo valor 90: " + bst.search(90)); // false
    }
}