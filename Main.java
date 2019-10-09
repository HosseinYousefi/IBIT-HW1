package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age:");
        age = in.nextInt();
        System.out.println("Oh cool so you're " + age + " years old");
    }
}
