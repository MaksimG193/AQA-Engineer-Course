import java.util.Arrays;
public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == 0) {
                arr[a] = 1;
            } else if (arr[a] == 1)
                arr[a] = 0;
        }
    System.out.println(Arrays.toString(arr));
}

