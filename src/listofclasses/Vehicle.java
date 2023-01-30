package listofclasses;

public class Vehicle{
    private String id, name, manufacturer;
    private int seat, rentPrice;
    private Lessor owner;
    public Vehicle(String id, String name, String manufacturer, int seat, Lessor owner, int rentPrice){
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.seat = seat;
        this.owner = owner;
        this.rentPrice = rentPrice;
    }
    public Lessor getOwner(){
        return owner;
    }
    public String getInfo(){
        return manufacturer + " " + name + " - " + id;
    }
    public int getRentPrice(){
        return rentPrice;
    }
}
