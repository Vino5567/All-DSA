package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class FreqOrder {
    public static void main(String[] args) {
        int[] arr = {2,2,3,5,4,12,2,3,3,3,12};
        System.out.println(freqOrder(arr));
    }

    private static List<Integer> freqOrder(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> map.get(b) - map.get(a));

        for(int n : map.keySet()){
            pq.offer(n);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(pq.size() > 0){
            int a = pq.poll();
            for (int i = 0; i < map.get(a); i++) {
                list.add(a);
            }
        }
        return list;
    }
}
