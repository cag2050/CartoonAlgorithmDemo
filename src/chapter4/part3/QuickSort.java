package chapter4.part3;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        // 递归结束条件：startIndex大于等于endIndex的时候
        if (startIndex >= endIndex) {
            return;
        }
        // 每次递归，先得到基准元素位置
        int pivotIndex = partitionV2(arr, startIndex, endIndex);
        // 根据基准元素，分成两部分递归排序
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    /**
     * 分治（单边循环法）
     *
     * @param arr        待交换的数组
     * @param startIndex 起始下标
     * @param endIndex   结束下标
     */
    private static int partitionV2(int[] arr, int startIndex, int endIndex) {
        // 取第一个位置的元素作为基准元素（也可以选择随机位置）
        int pivot = arr[startIndex];
        int mark = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int p = arr[mark];
                arr[mark] = arr[i];
                arr[i] = p;
            }
        }

        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }

    /**
     * 分治（双边循环法）
     *
     * @param arr        待交换的数组
     * @param startIndex 起始下标
     * @param endIndex   结束下标
     */
    private static int partition(int[] arr, int startIndex, int endIndex) {
        //待补充
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
