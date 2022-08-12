import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            int num = scn.nextInt();
            if (map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }

        int n2 = scn.nextInt();
        for (int i = 0; i < n2; i++) {
            int num = scn.nextInt();
            if (map.containsKey(num) == true) {
                System.out.println(num);
                int val = map.get(num);
                if (val == 1)
                    map.remove(num);
                else
                    map.put(num, val - 1);
            }
        }
    }

}