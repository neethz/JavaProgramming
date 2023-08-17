package Concepts.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);

        System.out.println("Item at index 2  is "+list.get(2));
        list.add(2,22);
        System.out.println("Item at index 2 is "+list.get(2));
        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(15));
        System.out.println(list);

        list.set(0,100);
        System.out.println(list);

        System.out.println(list.indexOf(Integer.valueOf(17)));
        list.clear();
        System.out.println(list);

    }
}
