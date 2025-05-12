package pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int num = i;
            for(int j = 1; j <= n - 1 + i; j++){
                if(j <= n - i) {
                    System.out.print(" " + " ");
                }else if(j <= n) {
                    System.out.print(num++ + " ");
                }else if(j > n){
                    System.out.print(--num - 1 + " ");
                }
            }
            System.out.println();
        }
    }

}



//           1
//         2 3 2
//       3 4 5 4 3
//     4 5 6 7 6 5 4
//   5 6 7 8 9 8 7 6 5
