package tree.exercises;

import java.util.ArrayList;

public class FindSize {
    Node root = null;

    public void insert(int data) {
        root = this.insertRec(root, data);
    }

    private Node insertRec(Node current, int data) {
        if(current == null) {
            return new Node(data);
        }

        if(data < current.data) {
            current.left = insertRec(current.left, data);
        } else {
            current.right = insertRec(current.right, data);
        }

        return current;
        
    }

    public void printTree() {
        this.printTreeRec(root);
    }

    private void printTreeRec(Node current) {
        if(current != null) {
            System.out.println(current.data);
            this.printTreeRec(current.left);
            this.printTreeRec(current.right);
        }
    }

    public int findSize() {
        return this.findSizeRec(root);  // tecnica de 'backtracking'

    }

    public int findSizeRec(Node node) {
        if(node == null) {
            return 0;
        }
        return 1 + findSizeRec(node.left) + findSizeRec(node.right);
    }
    
    public static void main(String[] args) {
        FindSize solution = new FindSize();
        solution.insert(5);
        solution.insert(3);
        solution.insert(1);
        solution.insert(10);
        solution.insert(8);
        solution.insert(15);

        solution.printTree();

        int result = solution.findSize();
        System.out.println(result);
    }
}
