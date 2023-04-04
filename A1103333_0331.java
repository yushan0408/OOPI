import java.util.Scanner;

class Animal {
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show() {
        System.out.print("Name: " + this.name + "\tHeight: " + this.height + "\tWeight: " + this.weight + "\tSpeed: " + this.speed);
    }

    double distance(double distance, double acceleration) {
        return distance * acceleration * speed;
    }

    double distance(double time) {
        return time * speed;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal{
    String sex;

    Human(String name, double height, double weight, String sex, double speed) {
        super(name, height, weight, speed);
        this.sex = sex;
    }

    void show() {
        super.show();
        System.out.print("  Sex: " + sex);
    }
}

class Snow extends Human {
    String ice;

    Snow(String name, double height, double weight, String sex, double speed, String ice) {
        super(name, height, weight, sex, speed);
        this.ice = ice;
    }

    void show() {
        super.show();
        System.out.print("  Ice: " + ice);
    }

    static double doubleSpeed(double x) {
        x *= 2;
        return x;
    }
}

public class A1103333_0331 {
    public static void main(String[] args) {
        
        Animal.showinfo();

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Human("阿克", 1.9, 80, "男", 120);
        animals[3] = new Human("漢斯", 1.8, 78, "男", 120);
        animals[4] = new Human("安娜", 1.7, 48, "女",  120);
        animals[5] = new Snow("愛莎", 1.7, 50, "女", 120, "Yes");

        for (int i = 0; i < 6; i++){
            animals[i].show();
            System.out.println(" ");
        }

        double speed;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("請輸入x: ");
            double x = input.nextInt();
            System.out.println("請輸入y: ");
            double y = input.nextInt();
            if (y == 0) {
                speed = animals[i].distance(x);
            } else if (x == 0) {
                speed = animals[i].distance(0);
            } else {
                speed = animals[i].distance(x, y);
            }

            if(i==5) {
                speed = Snow.doubleSpeed(speed);
            }
            System.out.println(animals[i].name + " speed is " + speed);
        }
    }
}

