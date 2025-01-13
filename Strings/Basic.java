package Strings;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // sc.close();
        // name = name.toUpperCase();
        String name = "Aritra";
        String title = new String("Adhikary");

        // String newTitle = title.toUpperCase();
        // System.out.println(newTitle);

        name += title;

        System.out.println(name);

        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
