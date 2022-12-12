public class ArrayOperation {
    public static void main(String[] args) {
        // declare array of object type
        Array[] arr1; // uninitialized array variable
        Array[] arr2 = new Array[5]; // initialize with Null references
        Array[] arr3 = new Array[4];
        // initialize array with object of Array type.
        arr1 = new Array[]{new Array(), new Array()};
        //print the length of three declared arrays
        System.out.println("Length of array 'arr1' : " + arr1.length);
        System.out.println("Length of array 'arr2' : " + arr2.length);
        System.out.println("Length of array 'arr3' : " + arr3.length);
        // print the elements of array 'arr2'
        System.out.println("Elements of array 'arr2'.");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("b[" + i + "]=" + arr2[i]);
        }
        // assign arr2 to array arr1
        arr1 = arr2;
        System.out.println("Now length of array 'arr1' : " + arr1.length);
        // Arrays of primitives:
        int[] a; // Null reference
        int[] b = new int[5];
        int[] c = new int[4];
        int[] d = {11, 47, 93};
        // fill values in integer array 'c'
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        
        // print length of arrays of primitive type
        System.out.println("Length of integer array 'b' = " + b.length);
        System.out.println("Length of integer array 'c' = " + c.length);
        System.out.println("Length of integer array 'd' = " + d.length);
        // print all the elements of array 'b'
        for (int i = 0; i < b.length; i++) {
            System.out.println("f[" + i + "]=" + b[i]);
        }
        // assign array 'd' to array 'a' and print the length of array 'a'
        a = d;
        System.out.println("Now length of array 'a' : " + a.length);
        // assign some new values in array 'a' and then print array 'a'.
        a = new int[]{1, 2};
        System.out.println("Final length of array 'a' : " + a.length);
    }
}
class Array {
}
