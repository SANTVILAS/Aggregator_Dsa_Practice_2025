package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test05_NumberTimeOfEach_Word_Occure {

    public static void main(String[] args) {
        String str="I love love java Techie";

        String[] arr=str.split(" ");

        Map<String,Long> map =Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


         map.forEach((key,value)-> System.out.println(key+" "+value));


        System.out.println("===============================");
         for(Map.Entry<String,Long> entry : map.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue());
         }
    }
}
