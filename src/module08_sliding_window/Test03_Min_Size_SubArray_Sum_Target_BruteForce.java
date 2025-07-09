package module08_sliding_window;

import java.util.ArrayList;

public class Test03_Min_Size_SubArray_Sum_Target_BruteForce {

//    public static int minSubArrayLen(int target,int arr[]){
//
//        int n =arr.length;
//       for(int i=0;i<arr.length;i++){
//           int minLenght = Integer.MAX_VALUE;
//           for(int j=i+1;i<arr.length;i++){
//               int sum =0;
//               sum = sum+arr[j];
//               if(sum < target){
//                   continue;
//               }else{
//                 int len = j-i+1;
//                 break;
//               }
//           }
//       }
//
//
//    }

    public static int minSubArrayLen1(int target,int arr[]){

        int n =arr.length;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
         int sum =0;
         for(int j=i+1;j<arr.length;j++){
              if(sum<target){
                  sum = sum + arr[j];
              }
              int len = j-i+1;
              minLen = Math.min(minLen, len);
         }
        }
 return minLen;

    }

    public static void main(String[] args) {
          int arr[] ={2,3,1,2,4,3};
          int ans=minSubArrayLen1(7,arr);
        System.out.println(ans);
    }
}
