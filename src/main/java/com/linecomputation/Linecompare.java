
package com.linecomputation;
import java.util.Scanner;
import java.lang.Math;

public class Linecompare

{
    static int UserInput() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter points of line: ");
        return a.nextInt();
    }

    static double LenCal (int a, int b, int c, int d) {
        double lenLine = Math.sqrt(Math.pow((c - a),2) + Math.pow((d - b),2));
        return lenLine;
    }

    public static void main(String args[])
    {
        System.out.println("This is line comparision problem");

        int x1 = UserInput();
        int y1 = UserInput();
        int x2 = UserInput();
        int y2 = UserInput();
        int p1 = UserInput();
        int q1 = UserInput();
        int p2 = UserInput();
        int q2 = UserInput();

        double lineLen1 = LenCal(x1, y1, x2, y2);

        double lineLen2 = LenCal(p1, q1, p2, q2);

        System.out.println("Length of line1: " + lineLen1);
        System.out.println("Length of line2: " + lineLen2);

        Double First, Second;

        First = new Double(lineLen1);
        Second = new  Double(lineLen2);
        int result = First.compareTo(Second);

        if(result > 0) {
            System.out.println("Line1 is greater than Line2");
        }else if(result < 0) {
            System.out.println("Line1 is less than Line2");
        } else {
            System.out.println("Line1 is equal to Line2");
        }

    }
}