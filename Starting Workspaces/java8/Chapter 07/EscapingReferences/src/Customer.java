
public class Customer implements ReadonlyCustomer {
    private String name;

    @Override
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

    @Override
    public String toString() {
        return name;
    }

}
