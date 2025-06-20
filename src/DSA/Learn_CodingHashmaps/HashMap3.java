package DSA.Learn_CodingHashmaps;
/*
Given a string s of lowercase English letters, the task is to find the first non-repeating character.
If there is no such character, return ‘$’.
Examples:
Input: s = “geeksforgeeks”
Output: ‘f’
Explanation: ‘f’ is the first character in the string which does not repeat.

Input: “aabbccc”
Output: ‘$’
Explanation: All the characters in the given string are repeating
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        String str="cchhayya";
        char ch=findFirstNonRepeatingCharacter(str);
        System.out.println(ch);
    }
public static char findFirstNonRepeatingCharacter(String s){
    // using linkedHashmap to maintain order of characters
    Map<Character,Integer> frequencyMap=new LinkedHashMap<>();

    //Step1 :- Count occurrences of each character
    for(char ch:s.toCharArray()){
        frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
    }
    //Step2:- Find the first non-repeating character
    for(Map.Entry<Character,Integer> entry: frequencyMap.entrySet()){
        if(entry.getValue()==1){
            return entry.getKey();
        }
    }
    //Step3 :- If no repeating character found, return '$'
    return '$';
}
}
