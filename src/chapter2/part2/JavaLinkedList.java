package chapter2.part2;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList =  new LinkedList<>();
        
        linkedList.add(0,3);
        linkedList.add(0,4);
        linkedList.add(2,9);
        linkedList.add(3,5);
        linkedList.add(1,6);
        linkedList.remove(0);
        linkedList.stream().forEach(node -> System.out.println(node));
    }
}
