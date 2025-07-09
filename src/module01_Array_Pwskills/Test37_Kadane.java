package module01_Array_Pwskills;

public class Test37_Kadane {

//    Example 1:
//
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//    Example 2:
//
//    Input: nums = [1]
//    Output: 1
//    Explanation: The subarray [1] has the largest sum 1.
//    Example 3:
//
//    Input: nums = [5,4,-1,7,8]
//    Output: 23
//    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

    public static int maxSumSubArray(int arr[]){
        int maxSum =0;
        int currentSum =0;

        for(int i=0;i<arr.length;i++){

            currentSum = currentSum + arr[i];


            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            if(currentSum<0){
             // how to leave or break array and consider other array
            currentSum =0;

            }

        }
        return  maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumSubArray(arr));;

    }
}
