package Practice;

import java.util.HashMap;
import java.util.PriorityQueue;

public class OrderInFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(ans(s));
    }
    private static String ans(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {  // add character and the frequency to the hashmap
            if(!map.containsKey(s.charAt(i))){
                map.put( s.charAt(i), 0);
            }
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>( (a,b) -> (map.get(b) - map.get(a)) );

        for(char key : map.keySet()){  // add the key to the pq
            pq.offer(key);
        }

        StringBuilder sb = new StringBuilder();

        while(pq.size() > 0){   // add the string in frequency order
            char c = pq.poll();
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
