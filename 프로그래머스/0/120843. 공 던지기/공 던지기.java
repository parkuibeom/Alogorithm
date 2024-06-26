class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int answer = 0;

        for (int i = 1; i < k; i++) {
            answer = (answer + 2) % n;
        }
        return numbers[answer];
    }
}