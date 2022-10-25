public class Book {
    String bookName;
    String authorName;
    int publishingYear;
    public Book(String bookName, String authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
    public String getBookName () {
        return bookName;
    }
    public String getAuthorName () {
        return authorName;
    }
    public int getPublishingYear () {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    }