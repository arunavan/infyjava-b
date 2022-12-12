
import java.util.*;

public class ConvertArrayToVector {

    public static void main(String[] args) {

        // declare and initialize array of object of given class.
        Object[] arrObject = {"Mahendra", new Date(), "Girish"};

        //create list for this object array.
        List list = Arrays.asList(arrObject);

        // create vector for given list.
        Vector vector = new Vector(list);

        // access the elements of the vector.
        Enumeration enume = vector.elements();
        while (enume.hasMoreElements()) {
            System.out.println(enume.nextElement().toString());
        }
    }
}