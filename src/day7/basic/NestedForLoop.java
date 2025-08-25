package day7.basic;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++){
            for(int j = 1; j<=3; j++){
                System.out.println(i + " " + j);
            }
            System.out.println("===============");
        }
        System.out.println("rest of code"); // in nested, while loop, for loop is nested and there should be max of 2-3 levels of looping in standard practice not more that
    }
}
