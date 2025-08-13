package arrays.exercises;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class FindMiddle {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void showList() {
        Node current = head;

        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;

        }
    }
    public static void main(String[] args) {
        FindMiddle myList = new FindMiddle();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        myList.showList();
    }
}
