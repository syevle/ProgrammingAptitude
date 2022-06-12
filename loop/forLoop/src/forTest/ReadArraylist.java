package forTest;

import java.util.ArrayList;

public class ReadArraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Adding elements into the arraylist

        list.add("Michael");
        list.add("Traver");
        list.add("Franklin");

        // Iterating the arraylist through the for-each loop

        System.out.println("Foreach Loop:");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        // Iterating the arraylist through for-loop

        System.out.println("For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
