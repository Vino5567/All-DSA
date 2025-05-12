package Practice;

import java.util.*;

public class RecursionPermutation {
    // Java Program to generate all unique
// permutations of a string




        // Recursive function to generate
        // all permutations of string s
        static void recurPermute(int index, StringBuilder s, Set<String> ans) {

            // Base Case
            if (index == s.length()) {
                ans.add(s.toString());
                return;
            }

            // Swap the current index with all
            // possible indices and recur
            for (int i = index; i < s.length(); i++) {
                char temp = s.charAt(index);
                s.setCharAt(index, s.charAt(i));
                s.setCharAt(i, temp);

                recurPermute(index + 1, s, ans);

                temp = s.charAt(index);
                s.setCharAt(index, s.charAt(i));
                s.setCharAt(i, temp);
            }
        }

        // Function to find all unique permutations
        static List<String> findPermutation(String s) {

            // sort input string
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            s = new String(sorted);

            // Stores the final answer
            List<String> ans = new ArrayList<>();

            // Stores all unique permutations
            Set<String> res = new TreeSet<>();
            recurPermute(0, new StringBuilder(s), res);

            // Copy all unique permutations
            // to the final answer
            ans.addAll(res);
            return ans;
        }

        public static void main(String[] args) {
            String s = "ABC";
            List<String> res = findPermutation(s);
            for (String x : res) {
                System.out.print(x + " ");
            }
        }
    }

