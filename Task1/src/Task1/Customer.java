package Task1;

public class Customer
{
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String lastName, String userName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String toString()
    {
        return "Customer: " + firstName + " " + lastName + " Username: " + userName;
    }

    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    String getUserName()
    {
        return userName;
    }

    int getId()
    {
        return id;
    }
}
