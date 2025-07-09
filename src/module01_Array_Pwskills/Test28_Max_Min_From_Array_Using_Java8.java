package module01_Array_Pwskills;

import java.util.Arrays;
import java.util.Optional;

public class Test28_Max_Min_From_Array_Using_Java8 {

    public static void main(String[] args) {

        int arr[] = {4,6,1,3,9,8};


         int ans = Arrays.stream(arr)
                .max()
                .orElseThrow(()-> new RuntimeException("Array is Empty "));
        System.out.println(ans);


        int arrayIsEmpty = Arrays.stream(arr)
                .min()
                .orElseThrow(() -> new RuntimeException("Array is Empty"));
        System.out.println(arrayIsEmpty);

    }
}
