public class Book {
    private String title;
    private Integer pages;
    private Integer publicationYear;

    public Book(String title, Integer pages, Integer publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String printEverything() {
        return (this.title + ", " + this.pages + " pages, " + this.publicationYear);
    }

    public String printName() {
        return (this.title);
    }
}
