package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.List;

public class Test14_Count_Digit {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(5,6,3,4,5,4,3,5,6,7,7,3,5);

        Long countInteger=list.stream().count();
        System.out.println(countInteger);

    }
}
