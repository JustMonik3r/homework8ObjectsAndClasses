package homework8ObjectsAndClasses;

public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname, name);
    }
}
