package lettcodeArray;

public class plant {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i  = 0; i < flowerbed.length; i++){

            Boolean left = i == 0 || flowerbed[i - 1] == 0;
            Boolean right = flowerbed.length - 1 == i || flowerbed[i + 1] == 0;

            if(left && right && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
            }

        }
        return n <= 0;
    }
}
