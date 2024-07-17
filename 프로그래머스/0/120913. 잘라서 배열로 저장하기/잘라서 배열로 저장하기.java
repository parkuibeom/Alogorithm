import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        int length = my_str.length();
        
        for (int i = 0; i < length; i += n) {
            answer.add(my_str.substring(i, Math.min(length, i + n)));
        }
        return answer;
    }
}