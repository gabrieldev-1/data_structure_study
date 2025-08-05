package linked_list;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class linkedListTest {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void removeNode(int data){
        if(head != null && head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while(current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if(current != null) {
            previous.next = current.next;
        }

    }

    public void showList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linkedListTest myList = new linkedListTest();

        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        myList.removeNode(1);
        myList.showList();
    }
    
}
