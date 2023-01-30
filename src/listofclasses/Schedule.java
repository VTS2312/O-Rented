package listofclasses;

public class Schedule{
    private String id, date, payment;
    private int duration;
    private Renter borrower;
    private Lessor owner;
    private Vehicle car;
    public Schedule(Renter r, Vehicle v, String date, int duration, String payment){
        this.date = date;
        this.duration = duration;
        this.payment = payment;
        this.borrower = r;
        this.car = v;
        this.owner = v.getOwner();
        this.id = r.getName() + duration + "_" + date;
    }
    public void showScheduleDetail(){
        System.out.println("Schedule id      : " + id);
        System.out.println("Duration (hours) : " + duration);
        System.out.println("Renter/borrower  : " + borrower.getName());
        System.out.println("Lessor/owner     : " + owner.getName());
        System.out.println("Vehicle          : " + car.getInfo());
        System.out.println("");
    }
    public String getVehicle(){
        return car.getInfo() + "(" + car.getOwner().getName() + ")";
    }
    public String getDate(){
        return date;
    }
    public int getDuration(){
        return duration;
    }
    public String getPayment(){
        return payment;
    }
    public Vehicle getVehicleObj(){
        return car;
    }
}
