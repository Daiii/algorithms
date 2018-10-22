/**
 * 二分查找
 *
 * @author zhangbo
 * @date 2018/10/22
 */
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        System.out.println(binarySearch(array, 0, array.length - 1, 78));
        System.out.println(binarySearch(array, 78));
    }

    /**
     * 二分查找 - 递归
     *
     * @param array  数组
     * @param start  开始位置
     * @param end    结束位置
     * @param target 目标值
     * @return 下标
     */
    private static int binarySearch(int[] array, int start, int end, int target) {
        int mid = (end - start) / 2 + start;
        if (array[mid] == target) {
            return mid;
        }

        if (start >= end) {
            return -1;
        } else if (target > array[mid]) {
            return binarySearch(array, mid + 1, end, target);
        } else if (target < array[mid]) {
            return binarySearch(array, mid - 1, end, target);
        }

        return -1;
    }

    /**
     * 二分查找
     *
     * @param array  数组
     * @param target 目标值
     * @return 下标
     */
    private static int binarySearch(int[] array, int target) {
        int mid = array.length / 2;
        if (target == array[mid]) {
            return mid;
        }

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
