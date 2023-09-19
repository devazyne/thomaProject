package epita.thoma.bankacc;

public class Customer {
    private String name;
    private String address;

    public Customer(String address , String name)
    {
        this.address = address ;
        this.name = name;
    }
    //test
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
