package linked_list.exercises;

public class SearchMiddle {
        Node head = null;
        
        public void addNode(int value) {
                Node newNode = new Node(value);

                if(head == null) {
                        head = newNode;
                        return;
                }
                
                Node currNode = head;
                while(currNode.next != null) {
                        currNode = currNode.next;
                }

                currNode.next = newNode;
        }

        public Node search() {
                Node slow = head;
                Node fast = head.next;

                while(fast != null) {
                        slow = slow.next;
                        fast = fast.next.next;
                }
                
                return slow;
        }

        public static void main(String[] agrs) {
                SearchMiddle solution = new SearchMiddle();
                solution.addNode(1);
                solution.addNode(2);
                solution.addNode(3);
                solution.addNode(4);
                solution.addNode(5);
                
                Node result = solution.search();
                System.out.println(result.data);

        }
}
