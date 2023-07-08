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
    public Author getAuthorName() {
        return this.authorName;
    }
    @Override
    public String toString() {
        return title + ", " + authorName + ", " + releaseYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b1 = (Book) other;
        return authorName.equals(b1.authorName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, releaseYear, authorName);
    }
}
