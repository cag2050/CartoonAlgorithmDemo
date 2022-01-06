package chapter3.part4;

// array[size++] 与 array[++size] 的区别
public class JavaArray {

    public static void main(String[] args) {
        int size = 0;
        int[] array = new int[]{2, 3, 4};

//        System.out.println(size);
//        System.out.println(array[size++]); // 2
//        System.out.println(size);
        System.out.println(size);
        System.out.println(array[++size]); // 3
        System.out.println(size);
    }
}
