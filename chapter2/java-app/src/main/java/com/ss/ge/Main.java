package com.ss.ge;

public class Main {

    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService();
        System.out.println(greetingService.greet(args[0]));
    }
}