import java.util.*;

public class A1103333_0224_1{
    public static void main (String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int a = num.nextInt();
        if(a % 2 == 0) {
            System.out.print(a + " is odd number.");
        } else {
            System.out.print(a + " is even number.");
        }
    }
}