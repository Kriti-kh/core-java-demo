package day4.basic;

public class OperatorsDemo5 {
    public static void main(String[] args) {

        //Logical Operators: &&(and) all statements should be true for true or false
        // ||(or) at least one statement should be true for true, if all false then false
        // !(not)

        int a= 10;
        int b = 20;
        int c =30;

        System.out.println( true && true); //true
        System.out.println( a < b && b < c); // true

        System.out.println(true && false); //false
        System.out.println( b < c && a > b);//false

        System.out.println(false && true); //false
        System.out.println(b > c && b > a); //false

        System.out.println(false && false); //false
        System.out.println(a > b && b > c ); //false

        System.out.println("============================");
        System.out.println(true || true); //true
        System.out.println(a< b || b < c); //true

        System.out.println(true || false); //true
        System.out.println(b < c || a > c); //true

        System.out.println(false || true); // true
        System.out.println( a > c || a < b); // true

        System.out.println(false || false); // false
        System.out.println(c < b || a > b); //false

        System.out.println("==========================");
        System.out.println(!true); // false
        System.out.println(!( a< b)); //false

        System.out.println(!false); // true
        System.out.println(!(a>b)); //true
    }
}
