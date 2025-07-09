package module01_Array_Pwskills;

public class Test35_NextGreatest_Element_Method2_Good {

    public static void nextGreatest(int arr[]){
        int n = arr.length;
        arr[n-1] =-1;
        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--){

            int temp = arr[i];  // Store current element before modifying it
            arr[i] = nge;       // Replace with next greatest element
            nge = Math.max(nge, temp); // Update NGE
        }


    }

    public static void main(String[] args) {

        int arr[] ={12,8,41,37,2,49,16,28,21};
        nextGreatest(arr);
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }

}
