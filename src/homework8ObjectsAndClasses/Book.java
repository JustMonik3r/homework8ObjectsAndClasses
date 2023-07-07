package homework8ObjectsAndClasses;

public class Book {
    private String title;
    private int releaseYear;
    private Author authorName;
    public Book(String title, Author authorName, int releaseYear) {
        this.title = title;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }
    public String getTitle() {
        return this.title;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public Author getAuthorName(Author authorName) {
        return this.authorName;
    }
}
