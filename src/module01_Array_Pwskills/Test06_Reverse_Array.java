package module01_Array_Pwskills;

public class Test06_Reverse_Array {

    public static void reverse(int arr[]){
    int i=0;
    int j= arr.length-1;

    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        reverse(arr);


    }
}
