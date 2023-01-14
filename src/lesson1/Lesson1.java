package lesson1;

/**
 * 1. Write a method that takes two integers to the input and checks that their amount lies in the range
 * from 10 to 20 (inclusive), if yes, return True, otherwise - false.
 *
 * 2. Write a method that is transmitted as a parameter as an integer,
 * the method should be printed in the console whether the number was transmitted or negative.
 Note: zero is considered a positive number.
 *
 * 3. Write a method to which an integer is transmitted as a parameter.
 * The method should return True if the number is negative, and return the FALSE if positive.
 *
 * 4. Write a method to which the line and number are transmitted as arguments,
 * the method must print the indicated number indicated number of times to the console;
 *
 * 5. * Write a method that determines whether the year is a leap year,
 * and returns Boolean (leaps -bosom - true, not a leap - false).
 * Every 4th year is a leap, except for every 100th, while every 400 is a leap.
 */
public class Lesson1 {

    public static void main(String[] args) {
        initialisePrimitiveDataTypes();
        try {
            float rez = calculate(2, 3, 4, 5);
            System.out.println(rez);
        }catch (ArithmeticException e){
            System.out.println("Error evaluating expression");
        }

        System.out.println();
        System.out.println(task10and20(3,5));
        System.out.println(task10and20(15,5));
        System.out.println(task10and20(3,25));
        System.out.println();

        isPositiveOrNegative(5);
        isPositiveOrNegative(-5);
        isPositiveOrNegative(0);
        System.out.println();

        System.out.println(isNegative(5));
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
        System.out.println();

        hello("Andrew");

        leapYear(2021);
        leapYear(2020);
        leapYear(2000);
        leapYear(2100);
        leapYear(2400);
        leapYear(1900);
    }

    public static void initialisePrimitiveDataTypes(){
        byte bt;
        short sh;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b;
        bt = -120;
        sh = 12442;
        i = 1000;
        l = 200000L;
        f = 12.23f;
        d = -123.123;
        c = '*';
        b = true;
    }

    public static float calculate(float a, float b, float c, float d){
        if (d == 0) {
            throw new ArithmeticException();
        }
        return a*(b+(c/d));
    }

    public static boolean task10and20(int n1, int n2){
        if((n1+n2)>=10 && (n1+n2)<=20){
            return true;
        }else{
            return false;
        }
    }

    public static void isPositiveOrNegative(int n1){
        if (n1<0){
            System.out.printf("The number %s a positive number \n",n1);
        }else {
            System.out.printf("The number %s a negative number \n",n1);
        }
    }

    public static boolean isNegative(int n1){
        return n1<0;
    }

    public static void hello(String name){
        System.out.printf("Hello, %s!\n",name);
    }

    public static void leapYear(int year){
        if((year%4!=0) || (year%100==0 && year%400!=0)){
            System.out.printf("Year %d is lap \n",year);
        }else{
            System.out.printf("Year %d not lap \n",year);
        }
    }
}
