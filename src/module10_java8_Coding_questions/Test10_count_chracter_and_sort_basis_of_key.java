package module10_java8_Coding_questions;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test10_count_chracter_and_sort_basis_of_key {

    public static void main(String[] args) {

        String str = "ssssssddddffffggghhhh";

       Map<Character,Long> map =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(map);


       map.entrySet().stream().sorted(Map.Entry.comparingByKey());

       map.forEach((key,value)-> System.out.println(key+ " "+value));

        System.out.println("=====================================");

        map.entrySet().forEach(System.out::println);
    }
}
