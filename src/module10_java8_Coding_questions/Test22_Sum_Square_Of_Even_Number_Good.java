package module10_java8_Coding_questions;

import java.util.*;
public class Test22_Sum_Square_Of_Even_Number_Good {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int ans=numbers.stream().filter(x->x%2==0).mapToInt(x->x*x).sum();

        System.out.println(ans);
    }
}
