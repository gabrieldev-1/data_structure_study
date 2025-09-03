package linked_list.exemple;

class Node {
    int data;
    Node next;
    Node previous; // Ponteiro para o no anterior;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class DoubleLinkedList {
    Node head = null;
    Node tail = null;

    public void addFront(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    public void addFinal(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;

        }
    }

    public void printList() {
        Node curNode = head;

        while(curNode != null) {
            System.out.println(" -> " + curNode.data);
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addFront(10);
        list.addFront(20);
        list.addFront(30);
        list.addFinal(40);
        list.addFinal(50);

        list.printList();
    }
}
