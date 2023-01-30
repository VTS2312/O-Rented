package listofclasses;

import java.util.ArrayList;

public class User{
    protected String id, password, name, birthDate, address, phone, email;
    protected ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
    public User(String id, String password, String name, String birthDate, String address, String phone, String email){
        this.id = id;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return id;
    }
    public boolean validate(String inpUsername, String inpPassword){
        return (inpUsername.equals(id) && inpPassword.equals(password));
    }
    public void addSchedule(Schedule s){
        scheduleList.add(s);
    }
    public void removeSchedule(Schedule s){
        scheduleList.remove(s);
    }
    public void showSchedule(){
        System.out.println(name + "'s Car Rental Schedule:");
        System.out.println("------------------------------------");
        for(Schedule s : scheduleList){
            s.showScheduleDetail();
        }
        System.out.println("");
    }
    public Schedule retrieveLatestSchedule(){
        return scheduleList.get(0);
    }
    public boolean checkList(){
        return scheduleList.isEmpty();
    }
}
