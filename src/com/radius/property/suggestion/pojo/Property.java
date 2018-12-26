package com.radius.property.suggestion.pojo;

import com.radius.property.suggestion.util.Util;

public class Property 
{
	/**Maximum distance of all suggestion should be less than 10 miles */
	private static final double MAX_DISTANCE = 10;
	
	private String mstrId;
	
    private double mdLatitude;

    private double mdLongitude;
    
    private long mlPrice;
    
    private int miNoBedRooms;
    
    private int miNoBathRoom;
    
    public int calculateMatch(Requirement pRequirement)
    {
    	int total_match = 0;
    	
    	double distance = Util.calculateDistance(mdLatitude, mdLongitude, pRequirement.getLatitude(), pRequirement.getLongitude());
    
    	total_match+= calculateDistanceMatch(distance);
    	
    	total_match+= calculatePriceMatch(pRequirement);
    	
    	total_match+= calculateBathRoomRating(pRequirement);
    	
    	total_match+= calculateBedRoomRating(pRequirement);
    	
    	return total_match;

    }
    
    private double calculateDistanceMatch(double distance)
    {
    	if(distance <=  2)
    		return 30;
    	
    	return ((MAX_DISTANCE - distance)/(MAX_DISTANCE -2))*30;
    }
    
    private long calculatePriceMatch(Requirement pRequirement)
    {
    	long max_budget = pRequirement.getMax_Budget();
    	long min_budget = pRequirement.getMin_Budget();
    	
    	// if either min or max budget is not provided then update the value of mina nd
    	if(min_budget == 0)
    	{
    		min_budget = (long) (0.9 * max_budget);
    		max_budget = (long) (1.1 * max_budget);
    	}
    	else if(max_budget == 0)
    	{
    		max_budget = (long) (1.1 * min_budget);
    		min_budget = (long) (0.9 * min_budget);
    	}

		if(mlPrice < max_budget && mlPrice > min_budget)
			return 30;
		
		if(mlPrice < min_budget)
		{
			return (long) (((min_budget - 0.9*min_budget)/(min_budget-mlPrice))*30);
		}
    
		return (long) (((1.1*max_budget - max_budget)/(mlPrice -max_budget))*30);
    }
    
    private int calculateBedRoomRating(Requirement pRequirement)
    {
    	Long min_bedRoom = pRequirement.getMin_BedRoom();
    	
    	Long max_bedRoom = pRequirement.getMax_BedRoom();
    	
    	if(min_bedRoom!= null && max_bedRoom!= null)
    	{
    		if(miNoBedRooms > min_bedRoom && miNoBedRooms < max_bedRoom)
    		{
    			return 20;
    		}
    	}
    	
    	//if number of bedrooms is less than number of bedrooms in property don't contribute to match percentage.
    	if(min_bedRoom != null && min_bedRoom<miNoBedRooms)
    		return 0;
    	
    	//in all other cases match percentage should be full and impact of match percentage will
    	// be on budget so automatically rating will go down.
    	return 20;
    }

    private int calculateBathRoomRating(Requirement pRequirement)
    {
    	Long min_bathRoom = pRequirement.getMin_BathRoom();
    	
    	Long max_bathRoom = pRequirement.getMax_BathRoom();
    	
    	if(min_bathRoom!= null && max_bathRoom!= null)
    	{
    		if(miNoBedRooms > min_bathRoom && miNoBedRooms < max_bathRoom)
    		{
    			return 20;
    		}
    	}
    	
    	//if number of bedrooms is less than number of bedrooms in property don't contribute to match percentage.
    	if(min_bathRoom != null && min_bathRoom<miNoBedRooms)
    		return 0;
    	
    	//in all other cases match percentage should be full and impact of match percentage will
    	// be on budget so automatically rating will go down.
    	return 20;
    }

	public String getId() {
		return mstrId;
	}

	public void setId(String mstrId) {
		this.mstrId = mstrId;
	}

	public double getLatitude() {
		return mdLatitude;
	}

	public void setLatitude(double mdLatitude) {
		this.mdLatitude = mdLatitude;
	}

	public double getLongitude() {
		return mdLongitude;
	}

	public void setLongitude(double mdLongitude) {
		this.mdLongitude = mdLongitude;
	}

	public long getPrice() {
		return mlPrice;
	}

	public void setPrice(long mlPrice) {
		this.mlPrice = mlPrice;
	}

	public int getNoBedRooms() {
		return miNoBedRooms;
	}

	public void setNoBedRooms(int miNoBedRooms) {
		this.miNoBedRooms = miNoBedRooms;
	}

	public int getNoBathRoom() {
		return miNoBathRoom;
	}

	public void setNoBathRoom(int miNoBathRoom) {
		this.miNoBathRoom = miNoBathRoom;
	}

	public static double getMaxDistance() {
		return MAX_DISTANCE;
	}
    
    
}
