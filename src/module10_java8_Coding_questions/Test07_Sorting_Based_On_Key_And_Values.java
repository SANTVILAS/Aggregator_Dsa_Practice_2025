package module10_java8_Coding_questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Test07_Sorting_Based_On_Key_And_Values {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("b", 3);
        map.put("a", 1);
        map.put("c", 2);


        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("===========================================");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
