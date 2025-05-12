package zoho;
import java.util.*;
public class AddEvenArrange {
    public static void main(String[] args) {
        long[] arr = {1,2,3,5,4,7,10};
        sortIt(arr);
    }
    public static void sortIt(long[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2 != 0 ){
                arr[i] *= -1;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                arr[i] *= -1;
            }
        }
    }
}
