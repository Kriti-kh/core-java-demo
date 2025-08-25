package day4.basic;

public class LiteralsDemo {

    //Literals: a source code representation of fixed value
    //Literals: fixed value + data Type
    //1.Integer Literal Type 436 8798 8797987987 98089080 (int)
    byte b = 127;
    short s =3434;
    int i = 2147483;
    long l = 232357656; // if the value goes above integer we need to write L
    long l2 = 214748364;

    // 2.floating literal 23.45 67.89( by default its double, therefore need to write f)
    float f = 32.45F;
    double d = 32.45;

    //3. boolean literals true false
    boolean bl1 = true;
    boolean bl2 = false;

    //4. character literals '1' 'a' '@', written in single quote
    char ch1= 'a';
    char ch2 = '1';
    char ch3 ='@';
    char ch4 = '\u0001'; // 1 in unicode

    //5.string literals : "fast", written inside double quote
    String s1= "hello";
    String s2 = "abc@123";
    String s3 ="abc";
    String s4= "true";
    String s5="98.7";
    String s6= " "; // blank space
    String s7 =""; // empty
    String s8= "Hello I am a full stack java  developer";
    String s9 = "a";

    //6. null literal
    String s10 = null;

    LiteralsDemo ob = new LiteralsDemo(); // this is an object in java(new creates object)(class type variable = value)
LiteralsDemo obj = null;
}
