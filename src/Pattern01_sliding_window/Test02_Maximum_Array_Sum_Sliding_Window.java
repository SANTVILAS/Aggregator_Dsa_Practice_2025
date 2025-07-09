package Pattern01_sliding_window;

public class Test02_Maximum_Array_Sum_Sliding_Window {
    public static void main(String[] args) {

        int k=3;
        int maxSum =0;
        int i=0;
        int j= k-1;  //3 - 1 = 2 .. 0 1 2
        int sum =0;
        int arr[] = {10,20,1,3,-40,80,10};
        int n = arr.length;

        for(int a=0;a<=k-1;a++){

            sum =sum + arr[a];

        }

        i++;
        j++;

        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++;
            j++;

        }
        // sliding window me pahli window se related calculation krna hoga

        //intution // Formula

        // single pass solution chiye ==yes

        // what about left and right values ==> yes

        // Do I need to maintain maxNumber  ==> yes

        //
        System.out.println(maxSum);
    }

}
