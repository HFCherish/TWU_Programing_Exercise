package com.twu.programing_exercises;

/**
 * Created by Peizhen Zheng on 2016/4/19.
 */
public class Triangle {

    public static void printOneAsterisk(){
        System.out.println("*");
    }

    public static void printHorizontalLine( int n ){
        for( int i=0; i<n; i++ )
            System.out.print("*");
        System.out.println();
    }

    public static void printVerticalLine( int n ){
        for( int i=0; i<n; i++ )
            System.out.println("*");
    }

    public static void printRightTriangle( int n ){
        for( int i=1; i<=n; i++ ){
            for( int j=0; j<i; j++ )
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printSegmentLine( String hint ){
        System.out.println();
        System.out.println( hint);
    }

    public static void main( String[] args ){
        Triangle.printSegmentLine("one asterisk:");
        Triangle.printOneAsterisk();

        Triangle.printSegmentLine("horizontal line:");
        Triangle.printHorizontalLine(8);

        Triangle.printSegmentLine("vertical line:");
        Triangle.printVerticalLine(3);

        Triangle.printSegmentLine("right triangle:");
        Triangle.printRightTriangle(3);
    }
}
