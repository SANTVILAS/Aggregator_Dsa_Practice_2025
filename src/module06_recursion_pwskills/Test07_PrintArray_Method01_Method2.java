package module06_recursion_pwskills;

public class Test07_PrintArray_Method01_Method2 {

    public static void printArray(int i,int arr[]){

        //base case
          if(i==arr.length){
              return ;
          }

        //work
        System.out.println(arr[i]+" ");
        printArray(i+1,arr);

    }

    public static void main(String[] args) {
        int arr[] ={4,5,7,8,1};

        printArray(0,arr);

    }
}
