class Solution {
    public int solution(String s) {
        String[] strNum = s.split(" ");
        int sum = 0;
        int lastNum = 0;

        for (String str : strNum) {
            if (str.equals("Z")) {
                sum -= lastNum;
            } else {
                lastNum = Integer.parseInt(str);
                sum += lastNum;
            }
        }
        return sum;
    }
}