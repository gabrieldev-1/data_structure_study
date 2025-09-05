package linked_list.exercises;

public class RemoveLastNode {
    Node head = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        Node last = head;

        if(last == null) {
            head = newNode;

        } else {

            while(last.next != null) {
                last = last.next;

            }

            last.next = newNode;            
        }

        
    }

    public void deleteLast() {
        Node last = head;
        Node previousLast = null;

        if(head == null) {
            System.out.println("A lista esta vazia.");
            return;

        }

        if(head.next == null) {
            head = null;
        }

        while(last.next != null) {
            previousLast = last;
            last = last.next;
        }

        previousLast.next = null;

    }

    public void printList() {
        Node curNode = head;
        
        while(curNode != null) {
            System.out.println(" -> " + curNode.data);
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        RemoveLastNode solution = new RemoveLastNode();

        solution.insertNode(10);
        solution.insertNode(20);
        solution.insertNode(30);
        solution.deleteLast();

        solution.printList();
    }
}
