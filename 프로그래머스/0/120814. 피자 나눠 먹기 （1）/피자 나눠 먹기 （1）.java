class Solution {
    public int solution(int n) {
int num = n / 7;
		if (n % 7 != 0) {
			num += 1;
		}
		int answer = num;
		return answer;
    }
}