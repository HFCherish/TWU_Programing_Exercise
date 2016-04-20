package com.twu.programing_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Peizhen Zheng on 2016/4/19.
 */
public class PrimeFactor {
    //return a list of factors of n
    public List<Integer> generate( int n ) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        int lastFactor = 2;
        int tempN = n;
        while( tempN != 1 && lastFactor <= n ){
            if( tempN % lastFactor == 0 ){
                factors.add(lastFactor);
                tempN /= lastFactor;
            }
            else
                lastFactor = findNextPrime( lastFactor + 1 );
        }

        return factors;
    }

    public int findNextPrime( int n ){
        while( !isPrime(n) )    n++;
        return n;
    }

    public boolean isPrime( int n ) {
        if( n < 2 ) return false;
        if( n < 4 ) return true;
        if( n % 2 == 0 )    return false;
        for( int i=3; i < n/2; i += 2 )
            if( n % i == 0 )    return false;
        return true;
    }

    public static void main(String[] args){
        PrimeFactor pf = new PrimeFactor();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println( pf.generate(n) );
    }

}
