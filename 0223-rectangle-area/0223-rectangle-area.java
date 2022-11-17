class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rectA = (ax2 - ax1) * (ay2 - ay1);
        int rectB = (bx2 - bx1) * (by2 - by1);
        
        int xOverlap = Math.min(ax2,bx2) - Math.max(ax1,bx1);
        int yOverlap = Math.min(ay2,by2) - Math.max(ay1,by1);
        
        int areaOfOverlap = 0;
        
        if (xOverlap > 0 && yOverlap > 0) {
            areaOfOverlap = xOverlap * yOverlap;
        }
        return rectA+rectB - areaOfOverlap;
    }
}

/*
 1. 
 Area of 1st rect = 3 - (-3) * 4 = 24
 Area of 2nd rect = 9 * (2-(-1)) = 27
 Tot area = 51
 Overlapping area = 3 * 2 = 6
 Area covered = 51 - 6 = 45
 
 2. 
 Area of 1st rect = 4 * 4 = 16
 Area of 2nd rect = 4 * 4 = 16
 Tot area = 32
 Overlapping area = 16
 Area covered = 16
 */
