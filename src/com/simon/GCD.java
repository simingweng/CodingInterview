package com.simon;

/**
 * Created by wen55527 on 11/9/16.
 */
public class GCD {

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
}
