package stacks;

// Utilizando arrays

public class Stack {
    private int[] stackArr;
    private int top = -1;

    public Stack(int size) {
        this.stackArr = new int[size];
    }

    public void push(int value) {
        if(top + 1 > stackArr.length - 1) {
            System.out.println("Stack overflow!");
            return;
        }

        top++;
        stackArr[top] = value;

    }

    public void pop() {
        if (top >= 0) {
            stackArr[top] = 0;
            top--;
        } else {
            System.out.println("Stack underflow!");
        }
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArr[i]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(5);
        myStack.push(15);
        myStack.push(10);
        myStack.push(5);
        myStack.pop();
        myStack.pop();
        myStack.printStack();

    }

}