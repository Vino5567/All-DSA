package zoho;

public class ReturnAskedNo {

    public static int find(int[] arr, int x, int y, int n){
        for (int i = 0; i < n; i++) {
            if(arr[i] < y && arr[i] > x){
                return arr[i];
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int n = 6,x = 10, y = 14;
        int[] arr = {4,3,7,11,50,1};
        System.out.println(find(arr, x, y, n));
    }

}

