package zoho;
//55 leet code
public class jump {
    public static void main(String[] args) {
        int[] arr = {2,3,1,0,4};
        System.out.println(find(arr));
    }

    public static boolean find(int[] arr){
        int i = 0;
        int max = 0;
        while(i <= arr.length){
           max = Math.max(max, i + arr[i]);
           if(max > arr.length){
               return true;
           }
           if(i == max){
               return false;
           }
            i++;
        }
        return false;
    }
}
