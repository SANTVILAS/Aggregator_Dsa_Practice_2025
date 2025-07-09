package module10_java8_Medium00;

import java.util.Arrays;

public class Test05_Third_Smallest_Number {

    public static void main(String[] args) {


        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k=3;


        int thirdSmallestNumber=Arrays.stream(array)
                .sorted()
                .skip(k-1)
                .findFirst()
                .orElse(-1);

        System.out.println(thirdSmallestNumber);
    }
}
