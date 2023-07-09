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
        return "имя='" + name + '\'' + ", фамилия='" + surname + '\'' + '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if(other == null){
            return false;
        }
        if(this == other){
            return true;
        }
        Author a1 = (Author) other;
        return name.equals(a1.name) && surname.equals(a1.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname, name);
    }
}
