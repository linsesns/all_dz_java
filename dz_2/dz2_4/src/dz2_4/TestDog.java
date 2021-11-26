package dz2_4;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("louis", 4);
        Dog d2 = new Dog("Matilda", 13);
        Dog d3 = new Dog("Bonya", 11);

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println("======================");

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println("======================");
        System.out.println(d3);

        d3.intoHumanAge();
    }
}
