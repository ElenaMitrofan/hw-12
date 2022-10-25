public class Main {
    public static void main(String[] args) {
    Book book1 = new Book ("It", "S. King", 1986);
    Author author1 = new Author("Stephen", "King");
    System.out.println(book1.getBookName() + " " + author1.getAuthorFirstName () + " " + author1.getAuthorLastName () + " " + book1.getPublishingYear());


    Book book2 = new Book ("Alice's Adventures in Wonderland", "Lewis Carroll", 1865);
    Author author2 = new Author("Lewis", "Carroll");
    System.out.println(book2.getBookName() + " " + author2.getAuthorFirstName () + " " + author2.getAuthorLastName () + " " + book2.getPublishingYear());
    book2.setPublishingYear(1862);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());

    }
}