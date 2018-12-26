package com.radius.property.suggestion.util;

public class Util 
{
	/**
	 * This method calculated distance in miles from source and destination lat and long
	 * @param pSrcLat
	 * @param pSrcLong
	 * @param pDestLat
	 * @param pDestLong
	 * @return
	 */
	public static double calculateDistance(double pSrcLat , double pSrcLong , double pDestLat , double pDestLong)
	{
        double theta = pDestLong - pSrcLong;
        double dist = Math.sin(deg2rad(pSrcLat)) * Math.sin(deg2rad(pDestLat)) + Math.cos(deg2rad(pSrcLat)) * Math.cos(deg2rad(pDestLat)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        return Math.abs(dist);
      }
	
	public static double deg2rad(double deg) 
	{
        return (deg * Math.PI / 180.0);
    }
  
	public static double rad2deg(double rad) 
	{
        return (rad * 180.0 / Math.PI);
    }
}
