package module01_Array_Pwskills;

import java.util.Arrays;

public class Test08_Sort_Array_0_And_1 {

    public static void sort0And1_Method1(int arr[]){

        Arrays.sort(arr);

        for(int elem :arr){
            System.out.print(elem+" ");
        }

    }

    public static void sort0And1_Method2(int arr[]){
        int countOfZeros =0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                countOfZeros++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<countOfZeros){
             arr[i] =0;
            }else{
                arr[i]=1;
            }
        }

        for(int elem :arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

    public static void sort0And1_Method3(int arr[]){
        int noOfZeros =0;
        int noOfOnes=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                noOfZeros++;
            }else{
                noOfOnes++;
            }
        }

        for(int i=0;i<noOfZeros;i++){
           arr[i] = 0;
        }

        for(int i=noOfZeros;i<arr.length;i++){
            arr[i] = 1;
        }
        System.out.println("Third method");
        System.out.println(Arrays.toString(arr));
    }

    // One pass Solution Two pointer

    public static void sort0And1_Method4(int[] arr){
        int i=0;
        int n=arr.length;
        int j = n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }else if(arr[j]==1){
                j--;
            }

            else if(arr[i]==1 && arr[j]==0){
              // swap(i,j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }

        System.out.println(Arrays.toString(arr));
    }





    public static void main(String[] args) {

        int arr[] = {1,0,1,1,0,0,0,1,1,0,1,1,0,0};
      //  sort0And1_Method1(arr);
       // sort0And1_Method2(arr);
      //  sort0And1_Method3(arr);
        sort0And1_Method4(arr);


    }
}
