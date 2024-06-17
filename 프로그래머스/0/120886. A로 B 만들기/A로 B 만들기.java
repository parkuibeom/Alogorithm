import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String sortedBefore = new String(beforeArr);
        String sortedAfter = new String(afterArr);
        
        if (sortedBefore.equals(sortedAfter)) {
            answer = 1;
        }
        
        return answer;
    }
}