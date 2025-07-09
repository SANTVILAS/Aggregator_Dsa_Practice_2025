package module01_Array_Pwskills;

import java.util.Arrays;

public class Test03_Basic_Operatoion_In_ArrayList {

    public static void main(String[] args) {

        int arr[] ={60,30,90,5,50,20,10};

        for(int elem: arr){
            System.out.print(elem+" ");
        }

        System.out.println();


        Arrays.sort(arr);

        for(int elem: arr){
            System.out.print(elem+" ");
        }

    }
}
