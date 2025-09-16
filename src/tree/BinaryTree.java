package tree;

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

    public Node insertRec(Node current, int data) {
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

    public void printInOrder(Node node) {
        if(node != null) {
            printInOrder(node.left);
            System.out.println(node.data + " ");
            printInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);

        System.out.println("Árvore após inserção (percurso in-order):");
        bst.printInOrder(bst.root);
        System.out.println();
    }
}