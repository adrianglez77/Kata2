package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,6,5,4,7,8,8,10,24,15};
        Map <Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int key : data) {
            map.put(key, map.containsKey(key) 
                    ? map.get(key) + 1 :1);
        }
          
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value= " + 
                entry.getValue());} 
    }
}
