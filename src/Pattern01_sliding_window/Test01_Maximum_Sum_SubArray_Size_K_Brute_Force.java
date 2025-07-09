package Pattern01_sliding_window;

public class Test01_Maximum_Sum_SubArray_Size_K_Brute_Force {
    public static void main(String[] args) {
        int arr[] = {10,20,1,3,-40,80,10};

        int n = arr.length;
        int k=3;
        int maxSum =0;
        for(int i=0;i<n-k+1;i++){
          int sum =0;
          for(int j=i;j<i+k-1;j++){
          sum = sum +arr[j];
          }
            maxSum = Math.max(sum,maxSum);
        }

        System.out.println(maxSum);
    }
}
