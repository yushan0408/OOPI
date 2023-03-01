import java.util.*;

public class A1103333_0224_2{
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter the temperature in Celsius: ");
        float a = num.nextFloat();
        float b = a * 9 / 5 + 32;
        System.out.printf("The temperature in Fahrenheit is : %.1f", b);
    }
}