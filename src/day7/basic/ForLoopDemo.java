package day7.basic;

public class ForLoopDemo {
    public static void main (String [] args){

        //for(initialization; condition; increment/decrement): syntax
        //looping
        //for loop
        //while loop
        //do-while loop
        //enhanced for loop(for-each)
        int sum = 0;
        for (int i =10; i <=50; i= i+10){ //(int i = 1; i<=5; i++){
            sum = sum + i;
            System.out.println("i: " + i);

        }
        System.out.println("sum: "+ sum);
    }
}


/*int a = 10;
int b= 20;
int c= 30;
int d= 40;
int e = 50;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);*/