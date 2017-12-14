/**
 * 将一个数组中的元素倒排过来。例如原数组为1, 2, 3, 4, 5, 8, 7, 0;则倒排后数组中的值
 *
 * @author ZHANGBO
 */
public class InvertedSequence {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 8, 7, 0};
        printArray(reverse(arrayNumber));
    }

    private static int[] reverse(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length / 2; i++) {
            int temp = arrayNumber[i];
            arrayNumber[i] = arrayNumber[arrayNumber.length - 1 - i];
            arrayNumber[arrayNumber.length - 1 - i] = temp;
        }
        return arrayNumber;
    }

    private static void printArray(int[] arrayNumber) {
        for (int num : arrayNumber) {
            System.out.println(num);
        }
    }
}
