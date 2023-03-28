import java.util.*;

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
        System.out.println("Name: " + this.name + "\tHeight: " + this.height + "\tWeight: " + this.weight + "\tSpeed: " + this.speed);
    }

    double distance(double x, double y) {
        return x*y*this.speed;
    }

    double distance(double x) {
        return x*this.speed;
    }
}

public class A1103333_0324_1 {
    public static void main (String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Animal("安娜", 1.7, 48, 120);
        animals[3] = new Animal("愛莎", 1.7, 50, 120);

        for (int i = 0; i < 4; i++){
            animals[i].show();
        }

        double speed;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("請輸入x: ");
            double x = input.nextInt();
            System.out.println("請輸入y: ");
            double y = input.nextInt();
            if (y == 0) {
                speed = animals[i].distance(x);
            }
            else {
                speed = animals[i].distance(x,y);
            }
            System.out.println(" " + animals[i].name + "speed is  " + speed);
        }
    }
}