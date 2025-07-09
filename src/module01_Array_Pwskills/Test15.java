package module01_Array_Pwskills;

public class Test15 {

    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8,9};

        boolean flag = false;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==5){
             flag = true;
              break;
          }
        }

        if(flag ==true){
            System.out.println("Flag Found..!!!");
        }else{
            System.out.println("Not Found ");
        }
    }

}
