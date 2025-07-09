package module10_java8_Coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Test04_Second_Highest_Number {

    private static int secondHighestNumber(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
            if( arr[i]>secondLargest&&arr[i]<largest){
                   secondLargest=arr[i];
            }

        }
      return secondLargest;

    }

   //method -2
    private static int secondLargest(int[] arr) {

       return Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Array should have Atleat two Element"));
    }



    public static void main(String[] args) {

        int arr[] = {2,5,9,3,1};
       // int arr[] = {};

        int secondHighestNumber=secondHighestNumber(arr);
        System.out.println(secondHighestNumber);
        System.out.println("=============================================");

        int secondLargest=secondLargest(arr);
        System.out.println(secondLargest);

    }



}
