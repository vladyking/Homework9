package Task;

public class Author {
    public String firstName;
    public String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;

        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
