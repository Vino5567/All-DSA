package TwoPointer;

public class mostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int length = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int min = Math.min(height[left], height[right]);
            int area = min * length;
            maxArea = Math.max(area, maxArea);
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
            length--;
        }
        return maxArea;
    }
}
