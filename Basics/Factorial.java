package Basics;

import Factorial.GetFact;

public class Factorial {
    public static void main(String[] args) {
        int fact = GetFact.calcFact(5);

        System.out.println("Factorial of 5 is: " + fact);
    }
}
