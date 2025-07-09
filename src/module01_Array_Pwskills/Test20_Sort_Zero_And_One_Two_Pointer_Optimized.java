package module01_Array_Pwskills;

import java.util.Arrays;

public class Test20_Sort_Zero_And_One_Two_Pointer_Optimized {


    public static void swap(int arr[],int i ,int j) {
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j]= temp;

    }


    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 1, 1, 0, 0, 0 };

        int i=0;
        int j=arr.length-1;
        //Two pinter

        //swaping
        while(i<j){

        if(arr[i]==0){
            i++;
        }

        if(arr[j]==1){
            j--;
        }

        if(i<j && arr[i]==1 && arr[j]==0){
            swap(arr,i,j);
            i++;
            j--;
        }
        }
        System.out.println(Arrays.toString(arr));
    }

    }


