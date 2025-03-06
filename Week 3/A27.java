import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length1 + length2];
        System.arraycopy(arr1, 0, result, 0, length1);
        System.arraycopy(arr2, 0, result, length1, length2);
        return result;
    }
}

