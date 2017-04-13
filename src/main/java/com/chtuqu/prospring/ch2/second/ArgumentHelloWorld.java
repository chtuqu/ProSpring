package com.chtuqu.prospring.ch2.second;

public class ArgumentHelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello, World!");
        }
    }
}
