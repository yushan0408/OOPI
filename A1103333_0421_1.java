import java.util.Scanner;

public class A1103333_0421_1 {
    public static void main(String[] args) {
        Scanner mail = new Scanner(System.in);
        System.out.print("請輸入電子郵件：");
        String email = mail.nextLine();
        System.out.println(email.matches("[a-z 0-9 . _]+[@][a-z 0-9 . -]+[.][a-z]{2,}"));
    }
}
