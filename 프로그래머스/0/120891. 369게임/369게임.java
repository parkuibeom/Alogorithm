class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = Integer.toString(order);
        for (int i = 0; i < strOrder.length(); i++) {
            char num = strOrder.charAt(i);
            if(num == '3' || num == '6' || num == '9'){
                answer++;
            } 
        }
        return answer;
    }
}