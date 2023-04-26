import java.util.Scanner;

public class A1103333_0421_2 {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.print("請輸入日期 ：");
        String time = date.nextLine();
        if (time.matches("[1-2]{1}[0-9]{3}[/]{1}[1-9]{1,2}[/]{1}[0-9]{1,2}")) {
            System.out.println(time);
        } else if (time.matches("[1-9]{1,2}[/]{1}[0-9]{1,2}[/]{1}[1-2]{1}[0-9]{3}")) {
            System.out.println(time);
        } else {
            System.out.println("輸入格式錯誤！");
        }
    }
}
