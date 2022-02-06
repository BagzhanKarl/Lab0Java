package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("");
            System.out.println("Hello, please choose one of the following:");
            System.out.println("Task 1 [1]");
            System.out.println("Task 2 [2]");
            System.out.println("Task 3 [3]");
            System.out.println("Task 4 [4]");
            System.out.println("Task 5 [5]");
            System.out.println("Task 6 [6]");
            System.out.println("Task 7 [7]");
            System.out.println("Task 8 [8]");
            System.out.println("Task 9 [9]");
            System.out.println("*******************************************");
            int choose = in.nextInt();
            if (choose == 0){
                break;
            }
            if (choose == 1){
                TestMain.Task1();
            }
            if (choose == 2){
                TestMain.Task2();
            }
            if (choose == 3){
                TestMain.Task3();
            }
            if (choose == 4){
                TestMain.Task4();
            }
            if (choose == 5){
                TestMain.Task5();
            }
            if (choose == 6){
                TestMain.Task6();
            }
            if (choose == 7){
                TestMain.Task7();
            }
            if (choose == 8){
                TestMain.Task8();
            }
            if (choose == 9){
                TestMain.Task9();
            }
        }
    }
}
