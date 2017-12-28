/**
 * 将一个数组中的元素倒排过来
 *
 * @author ZHANGBO
 */
public class InvertedSequence {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 8, 7, 0};
        printArray("before", arrayNumber);
        printArray("after", reverse(arrayNumber));
    }

    private static int[] reverse(int[] arrayNumber) {
        int[] calcArray = arrayNumber;
        for (int i = 0; i < calcArray.length / 2; i++) {
            int temp = calcArray[i];
            calcArray[i] = calcArray[calcArray.length - 1 - i];
            calcArray[calcArray.length - 1 - i] = temp;
        }
        return calcArray;
    }

    private static void printArray(String status, int[] arrayNumber) {
        StringBuilder builder = new StringBuilder(status + " : ");
        for (int item : arrayNumber) {
            builder.append(item);
            builder.append(" ");
        }
        System.out.println(builder.toString());
    }
}