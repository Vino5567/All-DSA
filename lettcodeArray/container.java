package lettcodeArray;

public class container {
        public static int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int max = 0;

            while(left < right){
                int current = Math.min( height[left], height[right] ) * (right - left); // check minimun height and multiply with length

                max = Math.max(max, current);

                if(height[left] < height[right]){
                    left++;
                }else{
                    right--;
                }
            }
            return max;
        }

    public static void main(String[] args) {
            int[] test1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test1));
//        container c1 = new container();
//        c1.maxArea(test1);
    }
    }

