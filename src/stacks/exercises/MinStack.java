// Criar um algoritimo que retorne o menor valor de uma pilha em uma complexiade temporal de O(1)
// Problema 155 do leetCode;

package stacks.exercises;
import java.util.ArrayList;

class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.addLast(val);

        if(minStack.isEmpty() || val < minStack.getLast()) {
            minStack.addLast(val);
        }

    }
    
    public void pop() {
        int removed = stack.removeLast();
        if (!minStack.isEmpty() && removed == minStack.getLast()) {
            minStack.removeLast();
        }
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        return minStack.getLast();
    }

    public static void main(String[] args) {
        MinStack solution = new MinStack();

        solution.push(10);
        solution.push(30);
        solution.push(3);
        solution.push(20);

        System.out.println(solution.getMin());

    }
}