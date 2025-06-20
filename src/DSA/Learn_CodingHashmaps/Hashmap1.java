package DSA.Learn_CodingHashmaps;
/*
Find the frequency of each character in a string
 */
import java.util.Map;
import java.util.HashMap;
public class Hashmap1 {
    public static void main(String[] args) {
        String input = "hello world";  // Example string
        countCharacterFrequency(input);
    }
    public static void countCharacterFrequency(String str){
                // Create a HashMap to store character frequencies
                Map<Character, Integer> frequencyMap = new HashMap<>();

                // Iterate through the string and count occurrences

                for (char ch : str.toCharArray()) {
                    frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                }
                // Print the frequency of each character
                System.out.println("Character frequencies:");
                for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
    }




