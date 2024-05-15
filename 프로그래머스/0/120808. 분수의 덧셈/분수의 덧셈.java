class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        	int mulnumer1 = numer1 * denom2;
		int mulnumer2 = numer2 * denom1;
		int sumnumer = mulnumer1 + mulnumer2;
		int muldenom = denom1 * denom2;

		int temp2 = sumnumer;
		int temp1 = muldenom;
		while (temp2 != 0) {
			int temp3 = temp2;
			temp2 = temp1 % temp2;
			temp1 = temp3;
		}
		sumnumer = sumnumer / temp1;
		muldenom = muldenom / temp1;

		int[] answer = { sumnumer, muldenom };
		return answer;
    }
}