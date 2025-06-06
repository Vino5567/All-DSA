package zoho;

public class Equilibirium {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0]=arr[0];
        suf[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i]){
                return i;
            }
        }
        return -1;

    }

}
