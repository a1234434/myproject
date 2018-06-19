package com.java2.schedule;

public class Courses {
    String code;
    String name;
    int weekday;
    int hours;
    int duration;
    
    public Courses(String code,String name,int weekday,int hours,int duration){
    	code =this.code;
    	name=this.name;
    	weekday=this.weekday;
    	hours=this.hours;
    	duration=this.duration;
    }
//先按快速鍵,回去再練習
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
