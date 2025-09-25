package stacks.exemples;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top = null;

    public void push(int data) {
        Node newNode = new Node(data);

        if(top == null) {
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;

    }

    public void printStack() {
        Node current = top;

        System.out.println("--------- pilha ---------");

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("-------------------------");

    }

    public void pop() {
        if(top == null) {
            System.out.print("A lista esta vazia.");
            return;
        }

        top = top.next; // O java remove o antigo top automaticamente (usando 'garbage collection')
    }

    public static void main(String[] args) {
        StackLinkedList myStack = new StackLinkedList();

        myStack.push(10);
        myStack.push(12);
        myStack.push(20);
        myStack.push(2);
        myStack.push(1);
        myStack.push(122);

        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        myStack.printStack();
    }
}
