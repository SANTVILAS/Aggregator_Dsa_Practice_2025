package module10_java8_Medium00;
import java.util.*;
public class Test02_Check_Prime_From_List_Interger {

    public static boolean isPrime(int number){


        if(number<1){
            return false;
        }

    for(int i=2;i<=Math.sqrt(number);i++){

        if(number%i==0 ){
         return false;
        }

    }


        return true;
    }

    public static void main(String[] args) {
        List<Integer> listOfInteger=Arrays.asList(3,5,6,7,8,9,1,11,23,56,7,8);
       boolean isPrimne = listOfInteger.stream().anyMatch(Test02_Check_Prime_From_List_Interger::isPrime);
        System.out.println(isPrimne);

    }
}
