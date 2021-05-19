package com.linecomputation;
import java.util.*;

public class Linecompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First point Co-ordinates");
        int x1 = s.nextInt();
        int y1 = s.nextInt();

        System.out.println("Enter the Second point Co-ordinates");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        Double firstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of line : " + firstLine);
    }
}
