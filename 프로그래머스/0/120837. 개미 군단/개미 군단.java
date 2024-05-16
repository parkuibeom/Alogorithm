class Solution {
    public int solution(int hp) {
        int num1 = hp/5;
        int num2 = hp%5/3;
        int num3 = hp%5%3/1;
        int answer = num1+num2+num3;
        return answer;
    }
}