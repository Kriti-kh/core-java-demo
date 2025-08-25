package day6.basic;

public class NestedIfElseDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 7;
        int c = 6;
        if(a > b) {
            if(a > c) {
                System.out.println("a is the largest one");
            } else {
                System.out.println(" c is the largest one");
            }
        }else {
            if(b>c){
                System.out.println("b is the largest one");
            }else{
                System.out.println("c is the largest one");
            }
        }
        System.out.println("rest of the code");
    }
}
