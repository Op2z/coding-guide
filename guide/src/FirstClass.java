import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        int age1 = 16;
        int age2 = 18;
        String name1 = "Eddie";
        String name2 = "Victor";
        //System.out.println(name1 + " " + age1 + " " + name2 + " " + age2);

        Chair chair1 = new Chair();
        chair1.setNumLegs(5);
        chair1.setOccupantName("eddie");

        Chair chair2 = new Chair();
        chair2.setOccupantName("victor");
        chair2.setNumLegs(4);

        Chair.setBrandName("ikea");

        chair1.printChair(); // 5eddieikea
        chair2.printChair(); // 4victorikea

        Scanner sc = new Scanner("string");
        Scanner sc2 = new Scanner(System.in);

    }
}

class Chair {
    int numberOfLegs;
    String occupantName;
    static String brandName;
    public void setNumLegs(int legs){
        numberOfLegs = legs;
    }
    public void setOccupantName(String name){
        occupantName = name;
    }
    public static void setBrandName(String brandName1){
        brandName = brandName1;
    }
    public void printChair(){
        System.out.println(numberOfLegs + occupantName + brandName);
    }
}