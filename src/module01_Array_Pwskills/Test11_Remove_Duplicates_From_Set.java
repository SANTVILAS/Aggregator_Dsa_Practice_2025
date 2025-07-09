package module01_Array_Pwskills;

import java.util.HashSet;
import java.util.Set;

public class Test11_Remove_Duplicates_From_Set {


    public static void removeDuplicateUsingSet(int arr[]){

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }

        }
        System.out.println(set);
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,3,4,5,5,6,7};
        removeDuplicateUsingSet(arr);

    }
}
