package Task;

public abstract class Main {

    public static void main(String[] args) {
        String author1 = String.valueOf(new Author("Barry", "Burd"));
        String author2 = String.valueOf(new Author("Eliezer", "Yudkowsky"));
        String book1 = String.valueOf(new Book("Java For Dummies", author1, 2019));
        String book2 = String.valueOf(new Book("Harry Potter and the Methods of Rationality", author2, 2015));
        System.out.println(book1);
        System.out.println(book2);
    }
}