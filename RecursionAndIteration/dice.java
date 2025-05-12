package RecursionAndIteration;

public class dice {
    public static void main(String[] args) {
        Roll("", 4);
    }
    public static void Roll(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            Roll(p + i, target - i);
        }
    }
}
