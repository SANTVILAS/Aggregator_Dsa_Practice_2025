package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test17_Remove_Empty_And_Null_From_Java8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sant",null,"vilas","",null, "keshari",null,"");
        List<String> listOfString=list.stream().filter(str->str!=null && !str.isEmpty()).collect(Collectors.toList());
        System.out.println(listOfString);

    }

}
