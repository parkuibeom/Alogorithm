import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
    
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
          
            while (n % i == 0) {
                if (!answer.contains(i)) {
                    answer.add(i);
                }
                n /= i;
            }
        }
        if (n > 1) {
            answer.add(n);
        }
        
        return answer;
    }
}