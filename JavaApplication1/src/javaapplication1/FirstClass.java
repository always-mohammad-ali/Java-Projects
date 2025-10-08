package javaapplication1;

//package firstclass;
public class FirstClass {
public static void main(String[] args) {
int anInt = 100;
long aLong = 200L;
byte aByte = 99;
short aShort = -902;
char aChar = 'A';
float aFloat = 99.98F;
double aDouble = 999.89;
boolean aBoolean = true;
System.out.println( "Sum: "+100 + anInt);
System.out.println("aLong = " + aLong);
System.out.println("aByte = " + aByte);
System.out.println("aShort = " + aShort);
System.out.println("aChar = " + aChar);
System.out.println("aFloat = " + aFloat);
System.out.println("aDouble = " + aDouble);
System.out.println("aBoolean = " + aBoolean);
int convert = (int)aDouble;
int another = (int)aLong;
System.out.println("Another: "+another);
System.out.println("Converted: "+convert);
int sumOfNumbers = another+ anInt;
System.out.println("Sum: "+sumOfNumbers);
}
}

