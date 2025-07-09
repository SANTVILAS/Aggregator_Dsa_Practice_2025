package module06_recursion_pwskills;

public class Test07_PrintArray_Method01 {

    public static void printArray(int arr[],int n){

        // int n = arr.length;
        //base case
         if(n==0){
             return;
         }

        //work
        printArray(arr,n-1);
        System.out.println(arr[n]);

    }

    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5} ;
        printArray(arr,5);

    }
}
