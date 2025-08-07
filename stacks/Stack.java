package stacks;

class Node {
    public int data;
    public Node previous;

    public Node(int data) {
        this.data = data;
        this.previous = null;
    }
}

public class Stack {
    public Node head;

    public void put(int data) {
        Node newNode = new Node(data);

        // A ponta para o antigo head;
        newNode.previous = head;

        // Torna o novo no o head;
        head = newNode;
    }

    public void pop() {
        if(head == null) {
            System.out.println("A lista esta vazia");
            return;

        }
        head = head.previous;

    }

    public void showStack() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.previous;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.put(1);
        myStack.put(2);
        myStack.put(3);
        myStack.showStack();
        myStack.pop();
        myStack.showStack();
    }
}
