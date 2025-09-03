package linked_list.exercises;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertNodes {
    Node head;

    public void insertAtBegenning(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;

    }

    public void insertInFinal(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            
        } else {
            Node last = head;

            while(last.next != null) {
                last = last.next;
            }

            last.next = newNode;

        }
    }

    public void printList() {
        Node currNode = head;

        while(currNode != null) {
            System.out.println(" -> " + currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        InsertNodes solution = new InsertNodes();

        solution.insertInFinal(10);
        solution.insertInFinal(20);
        solution.insertInFinal(30);
        solution.insertAtBegenning(5);

        solution.printList();
    }

}