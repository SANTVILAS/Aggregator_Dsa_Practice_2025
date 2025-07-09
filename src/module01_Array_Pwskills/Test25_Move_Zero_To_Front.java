package module01_Array_Pwskills;

import java.util.Arrays;

public class Test25_Move_Zero_To_Front {

    public static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static void moveZeroToFront(int arr[]){

        int i=0;
        int j= arr.length-1;

        while (i<j){

            if(arr[i]==0){
                i++;
            }

             else if(arr[j]==1){
                j--;
            }

            else if(arr[i]==1 && arr[j]==0){
              swap(arr,i,j);
            }


        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
     int arr[] = {1,0,1,1,0,0,1,0};
     moveZeroToFront(arr);

    }
}
