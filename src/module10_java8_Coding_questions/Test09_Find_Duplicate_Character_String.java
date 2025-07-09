package module10_java8_Coding_questions;

import java.util.HashMap;
import java.util.Map;

public class Test09_Find_Duplicate_Character_String {

    public static void main(String[] args) {

        String str = "Programming";

        //

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char elem=str.charAt(i);
            if(!map.containsKey(elem)){
              map.put(elem,1);
          }else{
              map.put(elem,map.get(elem)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }

    }
}
