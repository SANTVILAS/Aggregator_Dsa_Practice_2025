
package module01_Array_Pwskills;

// how to copy element from arr to new Array
// we get know what is deep copy
// what is shallow copy


import java.util.Arrays;

public class Test04_Copy_Of_Array {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};

        for(int elem:arr){
            System.out.print(elem+" ");
        }

        System.out.println();

              int nums[]=arr; //shallow copy


        nums[0] = 70;

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        System.out.println(arr[0]);

        //================Deep Copy=============================

        //M-1


        int brr[] = Arrays.copyOf(arr,arr.length);
           brr[0]=1000;


        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }

        System.out.println();

           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }


           // M-1 creating deep copy

        int crr[] = new int[arr.length];

           for(int i=0;i<arr.length;i++){
                    crr[i] = arr[i];
           }


        System.out.println();
           for(int elem:crr){
               System.out.print(elem+" ");
           }

    }
}
