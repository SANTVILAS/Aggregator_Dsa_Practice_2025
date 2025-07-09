package Pattern01_sliding_window;

public class Test02_Min_Size_SubArray_Whose_Sum_greaterThan_7_Sliding_Window {

    // yahan pta hi nhi h awindow ka size kya hai, variable size window

    //  pahle pahl windoe bna lo

    public int minSumSubArray(int arr[],int target){

        int sum =0;
        int minLen = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int n = arr.length;

        // pahle window banao

        while(j<n && sum<=target){  // this first window

            sum = sum + arr[j];

        }
        j--;  // ye isliye kia kyun ki j 1 aage nikal agya hai

        // Sliding window

        while(j<n){
            int len = j - i + 1;
            if(sum >= target)
            minLen =  Math.min(minLen,len);
            sum = sum - arr[i];
            i++; j++;
            while(j<n && sum < target){
                sum = sum + arr[j++];
            }
            j--;
        }

        return minLen;

    }
}
