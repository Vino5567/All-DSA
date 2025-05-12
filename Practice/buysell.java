package Practice;
//kammiyana kas ku vangi athigamana profit ku sell pannanu
public class buysell {
    public static void main(String[] args) {
        int[] prices = {7,2,10,1,6,4};
        System.out.println(find(prices));
    }

    public static int find(int[] prices){
        int max = 0;
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }

}
