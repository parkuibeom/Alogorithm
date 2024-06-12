import java.util.HashSet;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }
        answer = result.toString();
        return answer;
    }
}