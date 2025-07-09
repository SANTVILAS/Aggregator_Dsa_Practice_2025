package Pattern01_sliding_window;

public class Test02_Min_Size_SubArray_Whose_Sum_greaterThan_7_BruteForce {

    public static int minSubArraylen(int target, int[] arr){
      int n = arr.length ,minLen = Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
      int sum  =0; int j=i;
      while(j<n && sum<target){
          sum = sum + arr[j];
      }
      j--;
      int len = j - i + 1;
      if(sum >= target){
          minLen = Math.min(minLen,len);
      }
      }
       if(minLen == Integer.MAX_VALUE){
           return minLen;
       }
       return minLen;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        minSubArraylen(7,arr);
    }
}
