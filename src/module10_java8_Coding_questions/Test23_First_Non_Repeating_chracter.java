package module10_java8_Coding_questions;

import java.util.HashMap;
import java.util.Map;

public class Test23_First_Non_Repeating_chracter {
    public static void main(String[] args) {

        String str="hhello";
        char[] ch=str.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(Character c:ch) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c)+1);

            }

        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}