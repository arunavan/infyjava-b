
import java.util.Arrays;

public class ArraySortSearch {

    public static void main(String args[]) throws Exception {

        //declare, initialize and then print array of integer type.
        int array[] = {1, 2, 3, -8, 9, -2, 6, -7, -5, -3, -71, 56, 81, -36};
        show("Elements in array", array);

        // sort then print the specified arrray in ascending order.
        Arrays.sort(array);
        show("\nArray elements after sorting", array);


        // Search for element in specified array
        int index = Arrays.binarySearch(array, -71);
        System.out.println("\nIndex of integer -71 : " + index);

        // when element not present in array.
        index = Arrays.binarySearch(array, -52);
        System.out.println("\nElement not present in array." + index);

        // Insert one more element at the end of array
        array = insertElement(array, 1);
        show("Elements in integer array", array);
    }

    static void show(String msg, int arr[]) {
        System.out.println(msg + " : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    static int[] insertElement(int original[], int element) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, length);
        destination[length] = element;
        Arrays.sort(destination);
        return destination;
    }
}