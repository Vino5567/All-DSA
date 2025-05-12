package lettcodeArray;

import java.util.ArrayList;
import java.util.List;

public class candies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2}; int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length - 1; i++){
             if(candies[i] < candies[i + 1]){
                 max = candies[i + 1];
             }else{
                 max = candies[i];
             }
        }

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) < max){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }
}
