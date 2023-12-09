package models;

public class Producer implements Comparable<Producer> {
    private long id;
    private String firstName;
    private String lastName;

    public Producer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Producer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return STR. "Producer:" +
                "id: " + id +
                "     firstName: " + firstName +
                "     lastName: " + lastName
                ;
    }

    @Override
    public int compareTo(Producer o) {
        return this.firstName.compareTo(o.firstName) ;
    }
}
