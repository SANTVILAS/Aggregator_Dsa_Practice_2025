package module10_java8_Coding_questions;

import java.text.CollationElementIterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test20_Part2_Unique_Element_Good {

    public static void main(String[] args) {
        String str="ilovejavatechie";


        Map<Character,Long> map =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Character> uniqueElement =map.entrySet()
                .stream().filter(x->x.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uniqueElement);
    }
}
