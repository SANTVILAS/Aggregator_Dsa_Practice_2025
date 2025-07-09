package module10_java8_Coding_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test21_First_Non_Repeating_Good {

    public static void main(String[] args) {
        String str="ilovejavatechie";

        Map<Character,Long> map =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);


        Optional<Character> mapChar =map.entrySet().stream().filter(x->x.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(mapChar);

    }
}
