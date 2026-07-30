Brute Force Idea

Try every possible pair of lines.

For each pair:

Width = j - i
Height = min(height[i], height[j])
Area = width * height
Keep track of the maximum area.

  

class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length - 1; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
