import java.util.Arrays;

/**
 * 数组倒序输出
 *
 * @author zhangbo
 * @date 2018/10/22
 */
public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9, 8, 7, 6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 数组倒序
     * @param array 数组
     */
    private static void reverse(int[] array) {
        // 取中间下标对调位置
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
