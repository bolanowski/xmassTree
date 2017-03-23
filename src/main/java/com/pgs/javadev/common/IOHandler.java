package com.pgs.javadev.common;

import java.util.Scanner;

public class IOHandler {

    public void println(String write) {
        System.out.println(write);
    }

    public String readln() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
