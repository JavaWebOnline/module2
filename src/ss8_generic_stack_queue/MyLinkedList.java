package ss8_generic_stack_queue;

public class MyLinkedList<E> {
    private class Node {
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public void addFirst(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            System.out.println("Ngoài phạm vi");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return temp.value;
    }

    public E removeLast() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            for(int i = 2; i < size; i++) {
                temp = temp.next;
            }

            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        size--;
        return temp.value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
