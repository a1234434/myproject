package com.java2.schedule;

public class Courses {
    String code;
    String name;
    int weekday;
    int hours;
    int duration;
    
    public Courses(String code,String name,int weekday,int hours,int duration){
    	super();
    	this.code=code;
    	this.name=name;
    	this.weekday=weekday;
    	this.hours=hours;
    	this.duration=duration;
    }
    
    public boolean isAvailable(int weekday, int hours) {
    	boolean avail =true;
        if(weekday==this.weekday) {
        	if(hours>=this.hours&&hours<=this.hours+duration) {
        		return false;
        	}
        }
        return avail;
    }
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekday() {
		return weekday;
	}

	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

    
}
