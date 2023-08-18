package ss8_generic_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();

        int n = 6;
        while (n != 0) {
            integers.push(n % 2);
            n /= 2;
        }

        while (!integers.isEmpty()) {
            System.out.print(integers.pop());
        }
    }
}
