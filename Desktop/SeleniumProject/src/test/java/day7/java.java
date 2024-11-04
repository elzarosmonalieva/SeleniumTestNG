package day7;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class java {
    public static void main(String[] args) {
        String word = "apple";
        String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed+=word.charAt(i);
            }
        System.out.println(reversed);


            //Arrays
        int [] array1 = {1,2,3,4,5};
        int array2 [] = {1,2,3};
        int [] array3 = new int [5];
        System.out.println(Arrays.toString(array3));
    }
}
