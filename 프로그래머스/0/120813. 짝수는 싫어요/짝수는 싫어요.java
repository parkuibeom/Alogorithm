class Solution {
    public int[] solution(int n) {
   int[] answer;
		int num = 0;
		if (n % 2 == 0) {
			num = n / 2;
		} else {
			num = (n + 1) / 2;
		}
		answer = new int[num];
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[temp] = i;
				temp++;
			}
		}
		return answer;
    }
}