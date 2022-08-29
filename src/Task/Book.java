package Task;

public class Book {

    public String nameBook;
    public String authorName;
    public int yearPublication;

    Book(String nameBook, String authorName, int yearPublication) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
