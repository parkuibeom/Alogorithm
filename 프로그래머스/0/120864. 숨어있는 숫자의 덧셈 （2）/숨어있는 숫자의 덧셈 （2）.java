class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String number = "";

        for(int i = 0;i < my_string.length(); i++){
            char charStr = my_string.charAt(i);
            if(Character.isDigit(charStr)){
                number += charStr;
            }else{
                if(!number.equals("")){
                    answer += Integer.valueOf(number);
                    number = "";
                }
            }
        }
        if (!number.equals("")) {
            answer += Integer.valueOf(number);
        }
            return answer;
    }
}