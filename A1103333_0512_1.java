import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class A1103333_0512_1 {
    public static void main(String[] args) {
        System.out.println("請輸入共幾位顧客同時光臨:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<String> quantity = new ArrayList<String>();
        for(int i = 1 ;i <= a; i++){
            String name = "顧客"+ i;
            quantity.add(name);
        }
        ArrayList<sellingDumplingClass> tArrayList = new ArrayList<sellingDumplingClass>();
        for(int i = 0 ;i < a ; i++){
            tArrayList.add(new sellingDumplingClass(quantity.get(i)));
        }
        sc.close();
    }
}

class sellingDumplingClass implements Runnable {

    Thread t;
    static int beef = 3000,pork = 5000,veggie = 1000;
    static int toSellBeef = 0,toSellpork = 0,toSellVeggie = 0;    
    int soldBeef, soldPork, soldVeggie;

    sellingDumplingClass(String name) {
        soldBeef = 0;
        soldPork = 0;
        soldVeggie  = 0;
        t = new Thread(this, name);
        t.start();
    }
    public void run(){
        while(sellingDumplings() == true){
            soldBeef += toSellBeef;
            soldPork += toSellpork;
            soldVeggie += toSellVeggie;
            
            System.out.println(t.getName()+"買了" +soldBeef+ "顆牛肉水餃");
            System.out.println(t.getName()+"買了" +soldPork+ "顆豬肉水餃");
            System.out.println(t.getName()+"買了" +soldVeggie+ "顆蔬菜水餃");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

        }
        System.out.println(t.getName()+ "總共買了" +soldBeef+ "顆牛肉水餃");
        System.out.println(t.getName()+ "總共買了" +soldPork+ "顆豬肉水餃");
        System.out.println(t.getName()+" 總共買了" +soldVeggie+ "顆蔬菜水餃");


    }
    public int getsoldBeef() {
        return soldBeef;
    }

    public int getsoldPork() {
        return soldPork;
    }

    public int getsoldVeggie() {
        return soldVeggie;
    }

    synchronized private static boolean sellingDumplings() {
        SecureRandom sr= new SecureRandom();        
        if(beef > 0 || pork > 0 || veggie > 0){
            do{
                toSellBeef = sr.nextInt(51);
                toSellpork = sr.nextInt(51);
                toSellVeggie  = sr.nextInt(51);
            }while(toSellBeef + toSellpork + toSellVeggie < 50 && toSellBeef < beef && toSellVeggie < veggie && toSellpork < pork && toSellBeef + toSellpork + toSellVeggie > 10);
            beef -= toSellBeef;
            pork -= toSellpork;
            veggie -= toSellVeggie;
            return true;
        }else{
            return false;
        }

    }
}