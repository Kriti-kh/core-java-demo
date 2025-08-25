package day6.basic;

public class TypeCastingDemo1 {
    public static void main(String[] args) {
        byte b1= 127;

        //implicit type conversion(casting), done by java compiler
        int i1 = b1; //( integer is greater than byte)

        int i2= 127;

        //byte b2= i2; cannot be done as byte is smaller than integer
        //explicit type conversion(casting), done by java programmer
        byte b2 = (byte)i2;
        System.out.println("b2 = " + b2);
        System.out.println("i2 = " + i2);

        int i3 =200;
        byte b3 = (byte)i3;
        System.out.println("i3 = " + i3);
        System.out.println("b3 = " + b3); //it gives garbage value(-56) as 200 is out of range for byte, casting can be done only within range

        int i4 = 100;
        double d1 = i4;
        System.out.println("i4 = " + i4);
        System.out.println("d1 = " + d1);// automatically gives value 100.0


double d2 = 100.45;
int i5 = (int)d2;
        System.out.println("d2 = " + d2);
        System.out.println("i5 = " + i5);



    }
}
