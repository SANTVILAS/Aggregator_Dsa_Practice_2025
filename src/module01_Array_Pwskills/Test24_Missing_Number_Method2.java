package module01_Array_Pwskills;


// how to declare hash

public class Test24_Missing_Number_Method2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length;

        int hash[] = new int[n+2];
        for(int i=0;i<arr.length;i++){
          hash[arr[i]]++;
          //hash[arr[i]] = hash[arr[i]] + 1;

        }

        for(int i=1;i<n+1;i++){
            if(hash[i]==0){
                System.out.println(i+" ");
            }

        }


    }



}
