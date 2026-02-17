
public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer exist) {
		this.name = exist.getName();
    }

    public String toString() {
        return name;
    }

}
