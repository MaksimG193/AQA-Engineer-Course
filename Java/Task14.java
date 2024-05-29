import java.util.Arrays;
//Task 14
public static void twoArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
    }

public void main() {
    System.out.println(Arrays.toString(ArrayUtils.twoArr()));
}