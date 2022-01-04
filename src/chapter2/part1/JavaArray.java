package chapter2.part1;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 0;
        array[1] = 1;
        for( int element : array) {
            System.out.println(element);
        }
        // 下面的2个forEach语句等价
        Arrays.stream(array).forEach(element -> System.out.println(element));
        // Lambda can be replaced with method reference
        Arrays.stream(array).forEach(System.out::println);
    }
}
