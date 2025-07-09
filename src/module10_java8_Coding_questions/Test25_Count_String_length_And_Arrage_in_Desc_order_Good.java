package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test25_Count_String_length_And_Arrage_in_Desc_order_Good {

    public static void main(String[] args) {
        String str = "Sant Keshari vilas";
        String[] arr=str.split(" ");

       Map<String,Integer> map = Arrays.asList(arr).stream().collect(Collectors.toMap(x->x, word->word.length()));

       System.out.println(map);

        List<Map.Entry<String,Integer>> map1=map.entrySet().stream().sorted((I1, I2)->I1.getValue().compareTo(I2.getValue())).collect(Collectors.toList());

        System.out.println(map1);


    }

}
