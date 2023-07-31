package ss7_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add(10);
//        myArrayList.add(20);
//        myArrayList.add(30);
//        myArrayList.add(40);
//
//        System.out.println(myArrayList);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10); // 20 10
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);
        myLinkedList.add(2, 99);
        myLinkedList.add(2, 98);

        System.out.println(myLinkedList);
    }
}
