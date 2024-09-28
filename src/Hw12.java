public class Hw12 {

    public static void printInformationAboutBook(String name, Author author, int year){
        System.out.println("Название книги: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Мёртвые души", new Author("Иван", "Гоголь"), 1842);
        printInformationAboutBook(book1.getName(), book1.getAuthor(), book1.getYear());
        Book book2 = new Book("Повесть о Ходже Насреддине", new Author("Леонид", "Соловьёв"), 1956);
        printInformationAboutBook(book2.getName(), book2.getAuthor(), book2.getYear());
        Book book3 = new Book("Герой нашего времени", new Author("Михаил", "Лермонтов"), 1841);
        printInformationAboutBook(book3.getName(), book3.getAuthor(), book3.getYear());
        book3.setYear(1840);
        printInformationAboutBook(book3.getName(), book3.getAuthor(), book3.getYear());
    }
}
