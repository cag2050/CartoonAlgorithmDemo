package chapter4.part2;

import java.util.Arrays;

public class BubbleSortV1 {

    public static int[] bubbleSortV1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(i);
//                System.out.println(String.format("外循环下标：%d", i));
                System.out.println(String.format("外循环元素值：%d", array[i]));
//                System.out.println(String.format("内循环下标：%d", j));
                System.out.println(String.format("内循环元素值：%d", array[j]));
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 2, 5, 8, 1};
        int[] newArray = bubbleSortV1(array);
//        System.out.println(Arrays.toString(newArray));
    }
}
