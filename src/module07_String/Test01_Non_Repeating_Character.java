package module07_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// Do this question with frequency arry

public class Test01_Non_Repeating_Character {

    public static void main(String[] args) {
         String str = "geeksforgeeks";

        char[] arr =str.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character elem: arr){

            if(!map.containsKey(elem)){
                map.put(elem,1);

            }else{
                map.put(elem,map.get(elem)+1);
            }
        }
        // iterate thru map

        for(Map.Entry<Character,Integer> entry:map.entrySet()){

            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }



        }
    }
}
