package module01_Array_Pwskills;

import java.util.Arrays;

public class Test34_NextGreatest_Element {

    public static void nextGreatest(int arr[]){

        int n = arr.length;

        int ans[] = new int[arr.length];

        ans[n-1] = -1;
        for(int i=0;i<arr.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]>max){
                  // max = arr[j];
                 max = Math.max(max,arr[j]);
                }

            }

              ans[i] = max;

        }

        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[] ={12,8,41,37,2,49,16,28,21};
        nextGreatest(arr);
    }
}
