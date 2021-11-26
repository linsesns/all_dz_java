public class Test {
    public static void main(String[] args) {
        Corgi sobaken = new Corgi("Geibis", 7);
        Pug mops = new Pug(5, 12);
        System.out.println(sobaken.getName() + " " + sobaken.getAge());
        System.out.println(mops.getOld() + " " + mops.getWeight());
    }
}
