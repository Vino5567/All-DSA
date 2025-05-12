package zoho;
// {2000, 500, 200, 100, 50, 20, 10, 5, 1}
public class Currency {
    public static void main(String[] args) {
        int[] arr = {};
        int amount1 = 2456;
        int amount2 = 800;
        int amount3 = 3855327;
        count(amount3);
        //count(amount1);
    }
    public static void count(int amount){
        int[] currency = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] count = new int[9];

        for (int i = 0; i < currency.length; i++) {
            if(amount >= currency[i]){
                count[i] = amount / currency[i];
                amount = amount % currency[i];
            }
        }

        System.out.println("Currency Counts:");
        for (int i = 0; i < 9; i++) {
            System.out.println(currency[i] + ": " + count[i]);
        }
    }
}
