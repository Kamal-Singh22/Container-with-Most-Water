public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0; // Start pointer at the beginning
        int right = height.length - 1; // End pointer at the end
        int maxArea = 0;

        // Two-pointer approach
        while (left < right) {
            // Calculate the area
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum Water Area: " + maxArea(height));
    }
}
