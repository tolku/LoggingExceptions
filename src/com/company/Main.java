package com.company;

import exceptions.NotPositiveInteger;
import exceptions.LoggingExceptions;

public class Main {

    public static void main(String[] args) {
        int x;
        try {
            x = assignVariable(-1);
        } catch (NotPositiveInteger zero) {
            System.out.println(zero.toString());
            LoggingExceptions.log(zero);
        } finally {
            x = 1;
        }
        System.out.println(x);
    }

    public static int assignVariable(int x) throws NotPositiveInteger {
        if (x < 0) {
            throw new NotPositiveInteger("NUMBER MUST BE A POSITIVE VALUE");
        } else {
            return x;
        }
    }
}
