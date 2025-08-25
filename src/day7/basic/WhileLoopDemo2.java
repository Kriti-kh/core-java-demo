package day7.basic;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter name: ");
            String name = sc.next();
            if(name.equals("santosh")){
                flag = false;
            }
            System.out.println("Name: " +name); // till this line it is infinite, it keeps giving name
        }
        System.out.println("rest of code.");
    }
}
