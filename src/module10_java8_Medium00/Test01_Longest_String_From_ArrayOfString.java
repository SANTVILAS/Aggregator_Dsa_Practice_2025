package module10_java8_Medium00;

import java.util.*;


public class Test01_Longest_String_From_ArrayOfString {

    public static void main(String[] args) {
        List<String> list = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longestString=list.stream().max(Comparator.comparing(String :: length));

        System.out.println(longestString);

    }
}
