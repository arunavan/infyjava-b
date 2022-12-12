
public class ArrayDimensions {

    public static void main(String[] args) {

        //declare and initialize one dimension array
        String[] names = new String[]{"mahendra", "anu", "girish", "komal"};
        System.out.println("These are elements of one Dim array.");
        for (int i = 0; i < names.length; i++) {
            System.err.println(names[i] + "   ");
        }

        //declare and initialize two dimensional array
        String dim2[][] = {
                            { "mahendra", "girish"},
                            {"sandeep", "vinnet"},
                            {"ammit", "komal"}
                          };
        System.out.println("These are elements of two Dim array.");
        for (int i = 0;  i< 3 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(dim2[i][j]);
            }
        }
    }
}