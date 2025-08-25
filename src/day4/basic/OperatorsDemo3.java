package day4.basic;

public class OperatorsDemo3 {
    public static void main (String [] args){
        //3.Increment/Decrement Operators

        // ++ --
        //a++ post increment; first operation and then increment
        //a-- post decrement;
        //++a pre increment; first increment then operation
        // --a pre decrement;

        int a= 10 ;
        System.out.println(a);
       ++ a ;// if only to be increased by 1 //a+=1;
        System.out.println(a);

        int x = 5;
        System.out.println(x); //5
        System.out.println(x++); //5
        System.out.println(x); //6
        System.out.println(++x); //7

        int m = 8;
        int n =m++;
        System.out.println(m);//9
        System.out.println(n);//8
    }

}
