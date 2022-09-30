public class LuxuryRoom extends Room{
    private double tax_Amount;
    private double luxuryRoom_Bill;

    Customer c;

    public LuxuryRoom(String room_Id, double room_Price, int no_Of_Days,double tax_Amount) {
        super(room_Id, room_Price, no_Of_Days);
        this.tax_Amount = tax_Amount;

        c = new Customer("DG1516", "Varun", "L");
    }

    public void calculateLuxury_Room_Bill(){
        luxuryRoom_Bill = room_bill +tax_Amount;
        showDetails();
    }

    private void showDetails(){

        System.out.println("Customer ID: "+c.getCustomer_ID());
        System.out.println("Customer Name: "+c.getCustomer_Name());

        if(c.getCustomer_Type().equals("F")){
            System.out.println("Luxury Room Bill:"+luxuryRoom_Bill);
        } else if(c.getCustomer_Type().equals("L")){
            System.out.println("Room Bill: "+ room_bill);
        }

    }
}
