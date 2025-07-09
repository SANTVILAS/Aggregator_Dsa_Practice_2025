package module10_java8_Coding_questions;

import java.util.stream.IntStream;

public class Test08_Sum_No_Even_From_1_to_1000 {

    public static void main(String[] args) {

       int sumOfEven = IntStream.rangeClosed(1,1000).filter(x->x%2==0).sum();
        System.out.println(sumOfEven);
    }
}
