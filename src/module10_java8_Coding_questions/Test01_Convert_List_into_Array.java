package module10_java8_Coding_questions;

import java.util.ArrayList;
import java.util.List;

public class Test01_Convert_List_into_Array {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        //convert list into Array

        Integer[] array = list.stream().toArray(Integer[] :: new);

        for(Integer x :array){
            System.out.print(x+" ");
        }
    }
}
