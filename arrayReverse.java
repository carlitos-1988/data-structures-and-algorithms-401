import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.print.attribute.IntegerSyntax;

public class arrayReverse {

    public static void main(String[] args) {

        int myArray[] = {89, 2354, 3546, 23, 10, -92, 3, 823, -12};
        reverseArray(myArray);
        
    }
    public static void reverseArray(int[] array){
        
        
        for(int i = array.length-1; i >0; i--){
            System.out.println(array[i]);
        }
    }
}