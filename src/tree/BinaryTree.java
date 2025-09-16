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

        Node currNode = root;

        if(newNode.data < currNode.data) {
            while(currNode.left != null) {
                currNode = currNode.left;
            }
            currNode.left = newNode;
            return;

        }

        if(newNode.data > currNode.data) {
            while(currNode.right != null) {
                currNode = currNode.right;
            }

            currNode.right = newNode;
            return;
        }
    }
}