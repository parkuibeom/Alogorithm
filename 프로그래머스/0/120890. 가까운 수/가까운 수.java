import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int minNum = Math.abs(array[0] - n);
        for (int i = 1; i < array.length; i++) {
            int curNum = Math.abs(array[i] - n);

            if (curNum < minNum) {
                answer = array[i];
                minNum = curNum;
            }
            else if (curNum == minNum && array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;
    }
}