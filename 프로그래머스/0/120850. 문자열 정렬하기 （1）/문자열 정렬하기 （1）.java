import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < my_string.length(); i++){
            int num = my_string.charAt(i);
            if(47 < num && num < 58){
                answer.add(num-48);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}