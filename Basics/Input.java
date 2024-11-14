package Basics;

import java.util.*;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // sc.next(); function takes only a single word

        // String name = sc.next();

        String fullName = sc.nextLine();

        System.out.println("Name is :" + fullName);

        sc.close();

    }

}
