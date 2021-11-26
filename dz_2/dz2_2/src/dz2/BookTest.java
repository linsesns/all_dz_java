package dz2;

public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book("Мальчик в полосатой пижаме", "Джон Бойн", 288, 667.3);

        System.out.println(b1);

        System.out.println("==========================");

        b1.getInfoBook();
    }
}
