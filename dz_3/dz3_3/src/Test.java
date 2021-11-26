public class Test {

    public static void main(String[] args) {

        Book kniga1 = new Book("Стивен Кинг", "Сияние", 1977, 544);
        System.out.println(kniga1.getAuthor() + " " + kniga1.getName() + " " + kniga1.getYear() + " " + kniga1.getLabel());
    }
}
