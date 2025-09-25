package stacks;

import javax.swing.text.html.HTMLDocument.BlockElement;

// Utilizando arrays

public class Stack {
    private int[] stackArr;
    private int top = -1;

    public Stack(int size) {
        this.stackArr = new int[size];
    }

    private Boolean isFull() {
        return top == stackArr.length - 1;

    }

    private Boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        if(this.isFull()) {
            System.out.println("A pilha esta cheia!");
            return;
        }

        top++;
        stackArr[top] = value;
    }

    public void pop() {
        if(this.isEmpty()) {
            System.out.println("Nao e possivel remover elemetos. A lista esta vazia.");
            return;
        }

        stackArr[top] = 0;
        top--;

    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArr[i]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);


        myStack.push(5);
        myStack.push(10);
        myStack.printStack();

    }

}