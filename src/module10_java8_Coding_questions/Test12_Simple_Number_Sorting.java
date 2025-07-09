package module10_java8_Coding_questions;
import java.util.*;
import java.util.stream.Collectors;


public class Test12_Simple_Number_Sorting {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);


        List<Integer> listOfInte=list.stream().sorted().collect(Collectors.toList());
        System.out.println(listOfInte);

    }
}
