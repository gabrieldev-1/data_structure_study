package linked_list;

class Node {
    int data;
    Node next;
    
    Node(int data) {        this.data = data;
        this.next = null;
    }
}

public class TestLinkedList {
    Node head;

    public void insertFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    
    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        TestLinkedList list = new TestLinkedList();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        list.printList();
    }
}