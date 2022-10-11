package cn.isnap.leetcode.lc75.level1.day09;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color) return image;

        int w = image.length;
        int h = image[0].length;

        return floodFill(image, sr, sc, w, h, color, oldColor);
    }

    private int[][] floodFill(int[][] image, int x, int y, int w, int h, int color, int oldColor) {
        if (x < 0 || x >= w || y < 0 || y >= h)
            return image;

        if (image[x][y] == oldColor) {
            image[x][y] = color;
            floodFill(image, x-1, y, w, h, color, oldColor);
            floodFill(image, x+1, y, w, h, color, oldColor);
            floodFill(image, x, y-1, w, h, color, oldColor);
            floodFill(image, x, y+1, w, h, color, oldColor);
        }

        return image;
    }
}
