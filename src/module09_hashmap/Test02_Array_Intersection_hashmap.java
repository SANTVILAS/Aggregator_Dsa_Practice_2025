package module09_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test02_Array_Intersection_hashmap {


    public static void intersection(int arr1[],int arr2[]){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
               map.put(arr1[i],1);
            }
            map.put(arr1[i],map.get(arr1[i])+1);
        }

        for(int i=0;i<arr2.length;i++){

            if(map.containsKey(arr2[i])){

                int freq=map.get(arr2[i]);
                if(freq >0){
                    System.out.print(arr2[i]+" ");
                    map.put(arr2[i],freq-1);
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3,2,2,3,4,5};
        int arr2[] = {2,4,2,3,5,6,6};
        intersection(arr1,arr2);

    }
}
