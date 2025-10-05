package linked_list.exemple;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
           head = newNode;
           return;
        }

        Node current = head;
        while(current.next != null) {
            current.next = newNode;
        }
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(22);
        list.insert(3);
        list.insert(5);

    }
}