import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
      int[] numbers = array;
		Arrays.sort(numbers);
        int num = numbers.length/2; 
        int answer = numbers[num];
        return answer;
    }
}