class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();
        String answer = "";
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= 65 && charArray[i] <= 90){
                answer += Character.toString(charArray[i]+32);
            }else{
                answer += Character.toString(charArray[i]-32);
            }
        }

        
        return answer;
    }
}