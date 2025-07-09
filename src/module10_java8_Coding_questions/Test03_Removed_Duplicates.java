package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test03_Removed_Duplicates {




    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 3, 4, 6, 7);
        Set<Integer> ans = removeDuplicate(list);
        System.out.println(ans);
    }

    private static Set<Integer> removeDuplicate(List<Integer> list) {

        Set<Integer> set=list.stream().filter(i->Collections.frequency(list,1)>1).collect(Collectors.toSet());
         return  set;
    }
}
