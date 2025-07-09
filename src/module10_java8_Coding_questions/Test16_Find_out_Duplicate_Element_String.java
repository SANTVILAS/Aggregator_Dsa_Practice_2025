package module10_java8_Coding_questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test16_Find_out_Duplicate_Element_String {

    public static void main(String[] args) {

        String str = "ilovejavatechie";

        Map<Character,Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        List<Character> list =map.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(list);





        List<Character> list1 =map.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(list1);

    }
}
