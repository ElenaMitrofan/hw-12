public class Main {
    public static void main(String[] args) {
    Book book = new Book ("It", "S. King", 1986);
    Author author = new Author("Stephen", "King");

        System.out.println("bookName = " + book.bookName);
        System.out.println("authorName = " + author.authorFirstName + " " + author.authorLastName);
        System.out.println("publishingYear = " + book.publishingYear);


    }
}