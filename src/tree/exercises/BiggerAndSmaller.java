package tree.exercises;

public class BiggerAndSmaller {
    Node root = null;
    
    public void insert(int data) {
        root = this.insertRec(root, data);
        
    }

    private Node insertRec(Node current, int data) {

        if(current == null) {
            return new Node(data);
        }

        if(data < current.data) {
            current.left = this.insertRec(current.left, data);
        } else {
            current.right = this.insertRec(current.right, data);
        }

        return current;
    }

    public void printTree() {
        this.printTreeRec(root);
    }

    private void printTreeRec(Node current) {
        if(current != null) {
            this.printTreeRec(current.left);
            System.out.println(current.data);
            this.printTreeRec(current.right);
        }
    }

    public int[] searchBiggerAndSmaller() {
        Node smaller = root;
        Node bigger = root;

        while (smaller.left != null) {
            smaller = smaller.left;
        }

        while (bigger.right != null) {
            bigger = bigger.right;
        }

        return new int[] {smaller.data, bigger.data};
    }

    public static void main(String[] args) {
        BiggerAndSmaller solution = new BiggerAndSmaller();
        solution.insert(5);
        solution.insert(3);
        solution.insert(1);
        solution.insert(10);
        solution.insert(8);
        solution.insert(15);

        solution.printTree();

        int[] result = solution.searchBiggerAndSmaller();

        System.out.println(result[0] + " " + result[1]);
    }
}
