package module10_java8_Coding_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test24_First_Non_Repeating_Chracter_java8 {
    public static void main(String[] args) {

        String str="aaaccvddffbgg";

        Map<Character,Long> map =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Character firstNonRepeating = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null); // return null if no such character

        System.out.println("First non-repeating character: " + firstNonRepeating);
    }
}
