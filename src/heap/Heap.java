package heap;
import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public int leftChild(int index) {
        return (2 * index) + 1;
    }

    public int rightChild(int index) {
        return (2 * index) + 2;
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public void heapifyUp(int index) {
        if(index == 0) {
            return;
        }

        int indexParent = this.parent(index);
        
        if(heap.get(index) < heap.get(indexParent)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(indexParent));
            heap.set(indexParent, temp);

            this.heapifyUp(indexParent);
        }
    }
    public void heapifyDown(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int smallest = index;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != index) {
            int temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);

            heapifyDown(smallest);
        }
    }

    public void insert(int value) {
        heap.add(value);
        this.heapifyUp(heap.size() - 1);
    }

    public void pop() {
        if(heap.size() == 0) {
            System.out.println("A arvore esta vazia.");
            return;
        }
        
        if(heap.size() == 1) {
            heap.remove(0);
            return;
        }

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        heapifyDown(0);

    }

    public static void main(String[] args) {
        Heap solution = new Heap();

        solution.insert(3);
        solution.insert(3);
        solution.insert(5);
        solution.insert(6);
        solution.insert(8);
        solution.insert(9);
        solution.insert(10);

        solution.pop();

    }
}
