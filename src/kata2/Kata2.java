package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,6,5,4,7,8,8,10,24,15};
        Map <Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < data.length; i++) {
            if(map.containsKey(data[i])){
                map.put(data[i], map.get(data[i])+1);
            }else{
                map.put(data[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value= " + 
                entry.getValue());} 
    }
}
