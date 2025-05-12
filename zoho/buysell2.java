package zoho;

//eppala kas koraiyutho appala aven vangi viththu sambarikanu total profit find pannanu

public class buysell2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(find(prices));
    }

    public static int find(int[] prices){
        int profit = 0;
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit += prices[i] - min;
                min = prices[i];
            }
        }
        return profit;
    }

}
