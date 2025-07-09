public class Test16_Max_Number {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int mx = Integer.MIN_VALUE;
        int arr[] = {  4, 5, 7, 2, 3,10 };

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);


        // Method -2

        for(int i=0;i<arr.length;i++){
           mx= Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
