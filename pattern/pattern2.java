package pattern;

public class pattern2 {
    public static void main(String[] args) {
        int n = 3;

        for(int i = n; i > 0; i--){
            for(int j = n; j > 0; j--){
                for(int k = 1; k <= i; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}


// 3 3 3 2 2 2 1 1 1
// 3 3 2 2 1 1
// 3 2 1
