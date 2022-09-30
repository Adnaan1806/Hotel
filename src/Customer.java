public class Customer {
    private String customer_ID;
    private String customer_Name;
    private String customer_Type;

    public Customer(String customer_ID, String customer_Name, String customer_Type) {
        this.customer_ID = customer_ID;
        this.customer_Name = customer_Name;
        this.customer_Type = customer_Type;
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getCustomer_Type() {
        return customer_Type;
    }

    public void setCustomer_Type(String customer_Type) {
        this.customer_Type = customer_Type;
    }
}
