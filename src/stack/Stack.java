package stack;

public class Stack {
    static int[] stack = new int[10000];
    static int size = 0;

    public static void main(String[] args) {

    }

    void push(int data) {
        stack[size] = data;
        size++;
    }

    int pop() {
        if (empty()) {
            return -1;
        } else {
            size--;
            return stack[size];
        }
    }

    int size() {
        return size;
    }

    boolean empty() {
        return size() == 0;
    }

    int top() {
        if (empty()) {
            return -1;
        } else {
            return stack[stack.length - 1];
        }
    }
}
