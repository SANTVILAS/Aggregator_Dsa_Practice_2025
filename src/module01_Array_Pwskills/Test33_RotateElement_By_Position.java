package module01_Array_Pwskills;

public class Test33_RotateElement_By_Position {

    public static void reverse(int arr[],int i ,int j){

       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;

           i++;
           j--;
       }
    }




    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 3;
        int n = arr.length;
        reverse(arr, 0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr, 0,n-1);


        for(int elem :arr){
            System.out.print(elem+" ");
        }

    }

}
