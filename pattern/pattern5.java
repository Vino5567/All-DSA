package pattern;

public class pattern5 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


//Diamount


//int n = 5;
//
//        for (int i = 1; i < n * 2 + 1 ; i++) {
//int space;
//            if (i > n) space = i - n;
//            else space = n - i;
//
//            for (int j = 0; j < space; j++) {
//        System.out.print(" ");
//            }
//int col;
//            if (i > n) col = 1 + n - (i - n) ;
//        else col = i + 1;
//
//        for (int j = 1; j < col; j++) {
//        System.out.print("* ");
//            }
//                    System.out.println();
//        }
