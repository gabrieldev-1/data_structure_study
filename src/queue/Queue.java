package queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    Node head;
    Node tail;

public void insertItem(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
    System.out.println("Item " + data + " inserido.");
}

    public void removeItem() {
        if (head == null) {
            System.out.println("A fila esta vazia.");
            return;

        }

        int removedData = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        System.out.println("Item " + removedData + " removido.");

    } 

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] agrs) {
        Queue myQueue = new Queue();

        myQueue.insertItem(1);
        myQueue.insertItem(2);
        myQueue.insertItem(3);
        myQueue.removeItem();
        myQueue.printList();
    }

}