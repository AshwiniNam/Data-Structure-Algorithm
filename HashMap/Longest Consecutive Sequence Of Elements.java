//My approach

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> norep = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            if (map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
                norep.add(num);
            }
        }

        ArrayList<Integer> maxarr = new ArrayList<>();
        for (int i = 0; i < norep.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int val = norep.get(i);
            while (map.containsKey(val)) {
                arr.add(val);
                val = val + 1;
            }

            if (arr.size() > maxarr.size()) {
                for (int j = 0; j < maxarr.size(); j++) {
                    // System.out.print(arr.get(j)+" ");
                    maxarr.set(j, arr.get(j));
                }

                for (int j = maxarr.size(); j < arr.size(); j++) {

                    maxarr.add(arr.get(j));
                }
            }
        }
        for (int k = 0; k < maxarr.size(); k++) {
            System.out.println(maxarr.get(k));
        }
    }

}