package com.test;

/**
 * Class description goes here (optional)
 *
 * @author: Kirill Korolenko [korolenko.k.d@gmail.com]
 * Date: 2021-02-02
 * Time: 17:13
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final FSM fsm = new FSM();
        final Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("input: ");

            String input = sc.nextLine();

            fsm.handlingData(input);

            System.out.println("output: " + fsm.getState() + "\n");

            fsm.reset();
        }
    }
}
