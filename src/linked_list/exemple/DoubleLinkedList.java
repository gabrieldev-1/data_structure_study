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

    public void deleteFront() {
        if(head == null) {
            System.out.println("A lista esta vazia.");
            return;

        }

        if (head.next == null) {
            head = null;
            tail = null;

        } else {
            head = head.next;
            head.previous = null;

        }
    
    }

    public void deleteFinal() {
        if(head == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        if(head.next == null) {
            head = null;
            tail = null;

        } else {
            tail = tail.previous;
            tail.next = null;
        }
    }

    public void printList() {
        Node curNode = head;
        System.out.println("-----------------------");

        while(curNode != null) {
            System.out.println(" -> " + curNode.data);
            curNode = curNode.next;

        }


    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addFinal(10);
        list.addFinal(20);
        list.addFinal(30);
        list.addFinal(40);
        list.addFinal(50);

        list.addFront(5);
        list.addFront(2);

        list.printList();

        list.deleteFinal();
        list.deleteFinal();
        
        list.printList();

        list.deleteFront();
        list.deleteFront();

        list.printList();
    }
}
