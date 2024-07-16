import java.util.HashMap;
import java.util.Map;
class Solution {
    public long solution(String numbers) {
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
   
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while (i < numbers.length()) {
            for (String key : numberMap.keySet()) {
                if (numbers.startsWith(key, i)) {
                    result.append(numberMap.get(key));
                    i += key.length();
                    break;
                }
            }
        }
        long answer = Long.parseLong(result.toString());
        return answer;
    }
}