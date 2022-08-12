import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        // step 1
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            if (map.containsKey(num) == false) {
                map.put(num, true);
                arr.add(num);
            }
        }

        // step 2
        for (int key : map.keySet()) {
            if (map.containsKey(key - 1))
                map.put(key, false);
        }

        // step 3
        int startval = 0;
        int length = 1;
        for (int key : map.keySet()) {
            if (map.containsKey(key)) {
                int start = key;
                int size = 0;
                while (map.containsKey(start)) {
                    size = size + 1;
                    start += 1;
                }

                if (size > length) {
                    startval = key;
                    length = size;
                }
            }
        }

        while (length > 0) {
            System.out.println(startval);
            startval += 1;
            length--;
        }
    }

}