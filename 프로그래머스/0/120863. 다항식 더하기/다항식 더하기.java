class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");

        int xNum = 0; 
        int num = 0;    

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                num += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (xNum != 0) {
            result.append(xNum == 1 ? "x" : xNum + "x");
        }
        if (num != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(num);
        }

        return result.length() > 0 ? result.toString() : "0";
    }
}