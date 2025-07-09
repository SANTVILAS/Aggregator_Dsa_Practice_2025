package module01_Array_Pwskills;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class Test07_Rotate_Array_k_Step {
    public static void reverse(int arr[],int i,int j){

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k){
           int n= nums.length;
           k = k%n;
           reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);


        for(int elem:nums){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        rotate(arr,3);


    }
}
