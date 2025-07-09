package module01_Array_Pwskills;

public class Test23_Missing_Number {

    public static void main(String[] args) {

        // Sum of n natural no -  sum of array

        int arr[]={1,2,3,5};

        int n = 5;

        int SumOfN = n*(n+1)/2;

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum =sum + arr[i];

        }

        int missing_Number = SumOfN -sum;
        System.out.println(missing_Number);

    }
}
