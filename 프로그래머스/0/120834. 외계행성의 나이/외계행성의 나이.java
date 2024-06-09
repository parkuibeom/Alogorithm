class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = Integer.toString(age);

        for (char digit : ageStr.toCharArray()) {
            char alphabet = (char) ('a' + (digit - '0'));
            
            answer += alphabet;
        }

        return answer;
    }
}