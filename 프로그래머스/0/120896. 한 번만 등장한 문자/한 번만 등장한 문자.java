import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

class Solution {
    public String solution(String s) {
           
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        List<Character> charsArray = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                charsArray.add(entry.getKey());
            }
        }
        Collections.sort(charsArray);
        StringBuilder answer = new StringBuilder();
        for (char c : charsArray) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}