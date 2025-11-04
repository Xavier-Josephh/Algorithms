import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 40, 50, 95};
        int[] b = {0, 1, 5, 334, 343, 786, 999};

        int[] result = new int[a.length + b.length];
        int i =0;
        int j=0;
        int k = 0;
        while (k < result.length) {
            if (i < a.length && a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else if (j < b.length) {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
