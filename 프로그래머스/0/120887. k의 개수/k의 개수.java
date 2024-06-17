class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = Integer.toString(k); 

        for(int num = i; num <= j; num++){
            String strNum = Integer.toString(num); 
            for(char c : strNum.toCharArray()) { 
                if(c == strK.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}