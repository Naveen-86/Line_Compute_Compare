package com.linecomputation;
import java.util.*;

public class Linecompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Line");
        System.out.println("Enter the First point Co-ordinates");
        int x1 = s.nextInt();
        int y1 = s.nextInt();

        System.out.println("Enter the Second point Co-ordinates");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        Double firstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of First line : " + firstLine);

        System.out.println("Enter Second Line");
        System.out.println("Enter First point Co-ordinates");
        int x3 = s.nextInt();
        int y3 = s.nextInt();

        System.out.println("Enter Second point Co-ordinates");
        int x4 = s.nextInt();
        int y4 = s.nextInt();
        Double secondLine = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2));
        System.out.println("Length of Second Line : " + secondLine);

        int result = (firstLine.compareTo(secondLine));

        if(result > 0) {
            System.out.println("First line is greater than Second line");
        } else if(result < 0) {
            System.out.println("Second line is greater than First line");
        } else {
            System.out.println("First line is equal to Second line");
        }
    }
}
