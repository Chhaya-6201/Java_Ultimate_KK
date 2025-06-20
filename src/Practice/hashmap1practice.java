package Practice;

import java.util.HashMap;
import java.util.Map;

public class hashmap1practice {

    public static void main(String[] args) {

    }

    public static void countCharacterFrequency(String str){
        Map<Character,Integer> frequencyMap=new HashMap<>();
        for(char ch:str.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
            for(Map.Entry <Character,Integer> entry:frequencyMap.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
