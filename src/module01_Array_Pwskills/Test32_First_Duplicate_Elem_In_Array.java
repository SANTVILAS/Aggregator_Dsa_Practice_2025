package module01_Array_Pwskills;

import java.util.HashSet;
import java.util.Set;

public class Test32_First_Duplicate_Elem_In_Array {

    public static String firstDuplicateElement(String arr[]){

        Set<String> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            if(set.contains(arr[i])){
              return arr[i];
            }
            set.add(arr[i]);

        }
        return "";
    }

    public static void main(String[] args) {

        String arr[] = {"sant","vilas","kesahri","sant","vilas"};
        String ans= firstDuplicateElement(arr);
        System.out.println(ans);
    }
}
