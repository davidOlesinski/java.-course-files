package com.example.basics.data.operators;

import javax.imageio.stream.ImageInputStream;

public class Op5_logicalOperatorOr {
    public static void main(String[] args) {
        System.out.println("#1" + (true || true)); //true
        System.out.println("#2" + (true || false)); //true
        System.out.println("#3" + (false || false)); //false
        System.out.println("#4" + (2 > 5 || 24 != 12)); //true
        System.out.println("#5" + (47 >= 1 || 8 <= 6)); //true
        System.out.println("#6" + (1 != 1 || 5 != 5)); //fasle
    }

}
