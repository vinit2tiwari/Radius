package com.radius.property.suggestion.pojo;

public class Requirement 
{
	private String mstrId;
	
	private double mstrLatitude;
	
	private double mstrLongitude;
	
	private Long mlMin_Budget;
	
	private Long mlMax_Budget;
	
	private Long mlMin_BedRoom;
	
	private Long mlMax_BedRoom;
	
	private Long mlMin_BathRoom;
	
	private Long mlMax_BathRoom;

	public String getId() {
		return mstrId;
	}

	public void setrId(String mstrId) {
		this.mstrId = mstrId;
	}

	public double getLatitude() {
		return mstrLatitude;
	}

	public void setLatitude(double mstrLatitude) {
		this.mstrLatitude = mstrLatitude;
	}

	public double getLongitude() {
		return mstrLongitude;
	}

	public void setLongitude(double mstrLongitude) {
		this.mstrLongitude = mstrLongitude;
	}

	public Long getMin_Budget() {
		return mlMin_Budget;
	}

	public void setMin_Budget(long mlMin_Budget) {
		this.mlMin_Budget = mlMin_Budget;
	}

	public Long getMax_Budget() {
		return mlMax_Budget;
	}

	public void setMax_Budget(long mlMax_Budget) {
		this.mlMax_Budget = mlMax_Budget;
	}

	public Long getMin_BedRoom() {
		return mlMin_BedRoom;
	}

	public void setMin_BedRoom(long mlMin_BedRoom) {
		this.mlMin_BedRoom = mlMin_BedRoom;
	}

	public Long getMax_BedRoom() {
		return mlMax_BedRoom;
	}

	public void setMax_BedRoom(long mlMax_BedRoom) {
		this.mlMax_BedRoom = mlMax_BedRoom;
	}

	public Long getMin_BathRoom() {
		return mlMin_BathRoom;
	}

	public void setMin_BathRoom(long mlMin_BathRoom) {
		this.mlMin_BathRoom = mlMin_BathRoom;
	}

	public Long getMax_BathRoom() {
		return mlMax_BathRoom;
	}

	public void setMax_BathRoom(long mlMax_BathRoom) {
		this.mlMax_BathRoom = mlMax_BathRoom;
	}
}
