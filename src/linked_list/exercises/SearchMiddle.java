package linked_list.exercises;

public class SearchMiddle {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;

        } else {
            Node currNode = head;
            
            while (currNode.next != null) {
                currNode = currNode.next;

            }

            currNode.next = newNode;

        }
    }

    public void print() {
        Node currNode = head;
        while(currNode != null) {
            System.out.println(" --> " + currNode.data);
            currNode = currNode.next;
        }
    }

    public int search() {
        if(head == null) {
            throw new IllegalStateException("Lista vazia.");
            
        }

        Node currNode = head;
        int count = 0;

        while(currNode != null) {
            count++;
            currNode = currNode.next;
        }
        
        int middle = count / 2;
        currNode = head;

        for(int i = 0; i < middle; i++) {
            currNode = currNode.next;
        }

        return currNode.data;

    }

    public static void main(String[] args) {
        SearchMiddle list = new SearchMiddle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);

        list.print();

        int result = list.search();
        System.out.println("O meio da lista e em: " + result);
        
    }
}
