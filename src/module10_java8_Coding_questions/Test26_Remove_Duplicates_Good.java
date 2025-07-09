package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test26_Remove_Duplicates_Good {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1, 2, 2, 3, 7, 7, 5, 6, 9, 9);

        Set<Integer> set = new HashSet<>();

       List<Integer> listAns= listOfInteger.stream().filter(x->!set.add(x)).collect(Collectors.toList());

        System.out.println(listAns);

    }

}
