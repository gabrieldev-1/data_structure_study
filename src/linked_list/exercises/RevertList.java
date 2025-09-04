package linked_list.exercises;

class No {
    int data;
    No next;
    No previous;

    public No(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class RevertList {
    No head = null;
    No tail = null;

    public void insertNode(int data) {
        No newNode = new No(data);

        if(head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    
    public void printList() {
        if(head == null) {
            System.out.println("A lista esta vazia.");
            return;

        }
        No currNode = head;

        System.out.print("----------------------");

        while (currNode != null) {
            System.out.println(" --> " + currNode.data);
            currNode = currNode.next;
        }

        System.out.print("----------------------");

    }
    
    public void revert() {
        No current = head;
        No temp = null;
        
        
        if(head == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        while(current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;

            current = current.previous;
        }

        head = temp.previous;

    }

    public static void main(String[] args) {
        RevertList solution = new RevertList();

        solution.insertNode(10);
        solution.insertNode(20);
        solution.insertNode(30);
        solution.insertNode(40);

        solution.printList();

        solution.revert();

        solution.printList();
    }

}