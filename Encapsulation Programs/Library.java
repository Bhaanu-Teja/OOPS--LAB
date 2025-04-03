class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class Library {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("1984");
        b.setAuthor("George Orwell");

        System.out.println("Book: " + b.getTitle() + " by " + b.getAuthor());
    }
}
