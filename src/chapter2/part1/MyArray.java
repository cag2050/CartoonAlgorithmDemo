package chapter2.part1;

public class MyArray {
    // 数组的实际元素数量有可能小于数组的长度
    // 数组的长度
    private int[] array;
    // 数组的实际元素数量
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    /**
     * 数组插入元素
     *
     * @param index   插入的位置
     * @param element 插入的元素
     */
    public void insert(int index, int element) {
        // 数组的实际元素数量小于数组的长度时，
        // 如果插入元素在数组尾部，传入的下标参数index等于size
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        //如果实际元素达到数组容量上线，数组扩容
        if (size >= array.length) {
            resize();
        }
        //从右向左循环，逐个元素向右挪一位。
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        //腾出的位置放入新元素
        array[index] = element;
        size++;
    }

    /**
     * 数组扩容
     */
    public void resize() {
        int[] arrayNew = new int[array.length * 2];
        //从旧数组拷贝到新数组
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
    }

    /**
     * 数组删除元素
     *
     * @param index 删除的位置
     */
    public int delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        int deletedElement = array[index];
        //从左向右循环，逐个元素向左挪一位。
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(2);
        System.out.println(myArray.array.length);
        myArray.insert(0, 3);
        myArray.insert(1, 7);
        myArray.insert(2, 9);
        myArray.insert(3, 5);
//        myArray.insert(1, 6);
//        myArray.insert(5, 8);
        myArray.delete(3);
        myArray.output();
    }
}
