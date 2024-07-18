import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for (String q : quiz) {
            String[] parts = q.split(" ");
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            
            boolean isCorrect = false;
            if (operator.equals("+")) {
                isCorrect = (X + Y == Z);
            } else if (operator.equals("-")) {
                isCorrect = (X - Y == Z);
            }
            
            if (isCorrect) {
                answer.add("O");
            } else {
                answer.add("X");
            }
        }
        return answer.toArray(new String[0]);
    }
}