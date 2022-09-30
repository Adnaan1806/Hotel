public class Room {
    protected String room_Id;
    protected double room_Price;
    protected int no_Of_Days;
    protected double room_bill_final;

    public Room(String room_Id, double room_Price, int no_Of_Days) {
        this.room_Id = room_Id;
        this.room_Price = room_Price;
        this.no_Of_Days = no_Of_Days;
    }

    public void calculateRoomBill(){
        room_bill_final = room_Price*no_Of_Days;
    }

}
