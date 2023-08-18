package Concepts.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLists {
    public static void main(String[] args) {

        Queue<Integer> list1= new LinkedList<>();
        list1.offer(1);
        list1.offer(2);
        list1.offer(3);
        System.out.println(list1);
        System.out.println(list1.peek());
        System.out.println(list1.poll());
        list1.add(4);
        System.out.println(list1);
        System.out.println(list1.element());
        System.out.println(list1.remove());
        System.out.println(list1);




    }
}
