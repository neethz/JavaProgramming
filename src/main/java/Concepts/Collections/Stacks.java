package Concepts.Collections;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.add(1,22);
        System.out.println(stack);
        List<Integer> even= stack.stream()
                .filter(integer -> integer%2==0)
                .collect(Collectors.toList());
        even.forEach(System.out::println);
    }
}
