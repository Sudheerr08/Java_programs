package Package3_Array;

import java.util.HashSet;

public class removeduplicate2 {

    public static void main(String[] args) {

        int a[] = {2,2,1,1,3,3,3,4,7,8,5,5,5};

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);

        }
        for (int no:hs)
        System.out.println(no+" ");
    }
}