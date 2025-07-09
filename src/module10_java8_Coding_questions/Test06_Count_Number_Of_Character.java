package module10_java8_Coding_questions;



import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test06_Count_Number_Of_Character {

    private static Map<Character, Integer> countNumberOfCharacter(String str) {
        char[] arr= str.toCharArray();
        Map<Character,Integer> mapCount = new HashMap<>();

        for(Character c1:arr) {
            if(!mapCount.containsKey(c1)) {
                mapCount.put(c1, 1);
            }else {

                mapCount.put(c1, mapCount.get(c1)+1);
            }

        }
        return mapCount;

    }




    public static void main(String[] args) {
        String str = "aaaccadddeef";;
        Map<Character, Integer> map1=countNumberOfCharacter(str);

        for(Map.Entry<Character,Integer> entry :map1.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue() );
        }


        System.out.println("===============================================");
        //using java8
         Map<Character,Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((key,value)->System.out.println(key+" "+value));
    }
}
