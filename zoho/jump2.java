package zoho;
//45 leet code
public class jump2 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,4};
        System.out.println(find(arr));
    }

    public static int find(int[] arr){

        int max = 0, temp = 0, count = 0;

        for(int i = 0; i < arr.length - 1; i++){
            max = Math.max(max, i + arr[i]);

            if(max >= arr.length - 1){
                break;
            }

            if(temp == i){
                count++;
                temp = max;
            }
        }


        return count;
    }
}
