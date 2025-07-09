package module01_Array_Pwskills;

import java.util.Arrays;

public class Test29_Reverse_Array {

    public static void swap(int arr[],int i,int j){

        int temp =  arr[i];
        arr[i] =arr[j];
        arr[j] = temp;



    }

    public static void reverse(int arr[]){

        int i= 0;
        int j=arr.length-1;

        while(i<j){

            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[] ={2,4,5,67,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
