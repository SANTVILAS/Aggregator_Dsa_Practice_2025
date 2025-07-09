package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test27_Last_Element_From_Array {
    public static void main(String[] args) {

        int arr[] = {1,2,3,6,7,8,9};

        int ans=Arrays.stream(arr)
                .skip(arr.length-1)
                .limit(1)
                .findFirst()
                .orElse(-1);

        System.out.println(ans);



        int lastElem=Arrays.stream(arr)
                .reduce((x,y)->y)
                .orElseThrow(()->new IllegalStateException("Array is empty"));

        System.out.println(lastElem);

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        Optional<String> ans1=listOfStrings.stream()
                .skip(listOfStrings.size()-1)
                .limit(1)
                .findFirst();


        String lastElement1 = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();

        System.out.println(ans1);
        System.out.println(lastElement1);
    }


}
