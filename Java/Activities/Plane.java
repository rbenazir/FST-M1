package activities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    Plane(int maxPassengers){
    	this.maxPassengers=maxPassengers;
    	this.passengers= new ArrayList<>();
    }
    
    void onboard(List<String> passengers) {
    	for(String passenger:passengers)
    	this.passengers.add(passenger);
    }
    
    Date takeOff() {
    	 return new Date();
    }
    
    void land() {
    	this.lastTimeLanded=new Date();
    	this.passengers.clear();
    }
    
    Date getLastTimeLanded() {
    	return this.lastTimeLanded;
    }
    
    List<String> getPassesngers(){
    	return this.passengers;
    }
}
