package module01_Array_Pwskills;

public class Test19_ReverseArray_M2 {

    public static void main(String[] args) {


        int arr[] = {10,20,30,40,50,60,70};
        int n = arr.length;

        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;

        }
        System.out.println();
        for(int elem:arr) {
            System.out.print(elem+" ");
        }



    }
}
