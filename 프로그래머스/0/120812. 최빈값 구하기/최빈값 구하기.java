import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
     int[] numbers = array;
		Arrays.sort(numbers);
		int max = numbers[numbers.length - 1];
		int[] count = new int[max + 1];

		for (int i = 0; i < numbers.length; i++) {
			count[numbers[i]]++;
		}

		max = count[0];
		int answer = 0;
		for (int i = 1; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = i;
			}else if(max == count[i]) {
				answer = -1;
			}
		}

		return answer;
    }
}