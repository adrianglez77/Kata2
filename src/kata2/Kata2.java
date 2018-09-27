package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1,2,3,4,5,6,6,5,4,7,8,8,10,24,15};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr= histo.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value= " + 
                entry.getValue());} 
    }
}
