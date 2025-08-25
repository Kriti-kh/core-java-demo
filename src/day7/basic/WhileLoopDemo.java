package day7.basic;

public class WhileLoopDemo {
    public static void main(String[] args) {

        // while(condition){
        int i = 1;
        int sum = 0;
        while (i <= 5){
            sum +=i;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("sum is: " + sum);
    }
}
