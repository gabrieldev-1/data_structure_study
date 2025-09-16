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
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while(current != null) {
            parent = current;

            if (data < current.data) {
                current = current.left;
        
            } else {
                current = current.right;

            }
        }

        if(data < parent.data) {
            parent.left = newNode;

        } else {
            parent.right = newNode;
        }

    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
    }
}