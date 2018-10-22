import java.util.Arrays;

/**
 * 快速排序
 *
 * @author zhangbo
 * @date 2018/10/22
 */
public class QuickSort {
    public static void main(String[] args) {
        int array[] = {32, 12, 7, 78, 23, 45};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 快速排序
     *
     * @param array 数组
     * @param left  左下标
     * @param right 右下标
     */
    private static void quickSort(int array[], int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;
        int key = array[left];

        while (i < j) {
            while (i < j && array[j] > key) {
                j--;
            }
            //从后往前找到第一个比key小的数与array[i]交换
            array[i] = array[j];

            while (i < j && array[i] < key) {
                i++;
            }

            //从前往后找到第一个比key大的数与array[j]交换
            array[j] = array[i];
        }

        //一趟快排之后已经将key的位置找到
        array[i] = key;
        //对key左边的进行排序
        quickSort(array, left, i - 1);
        // 对key右边的进行排序
        quickSort(array, i + 1, right);
    }
}
