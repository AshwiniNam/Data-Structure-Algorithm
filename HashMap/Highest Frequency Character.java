import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        // char ans=' ';
        // int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                map.put(ch, val + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // using keySet function
        char max = s.charAt(0);
        for (char key : map.keySet()) {
            if (map.get(key) > map.get(max)) {
                max = key;
            }
        }
        System.out.println(max);
    }

}