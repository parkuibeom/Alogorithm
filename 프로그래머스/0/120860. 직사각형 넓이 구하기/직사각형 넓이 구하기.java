class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
         for (int[] dot : dots) {
            if (dot[0] < minX) {
                minX = dot[0];
            }
            if (dot[0] > maxX) {
                maxX = dot[0];
            }
            if (dot[1] < minY) {
                minY = dot[1];
            }
            if (dot[1] > maxY) {
                maxY = dot[1];
            }
        }
        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}