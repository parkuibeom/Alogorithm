class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String strNum = Integer.toString(num); 
            for (char c : strNum.toCharArray()) { 
                if (c == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}