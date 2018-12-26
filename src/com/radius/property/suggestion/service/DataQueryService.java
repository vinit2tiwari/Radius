package com.radius.property.suggestion.service;

import java.util.ArrayList;
import java.util.List;

import com.radius.property.suggestion.pojo.Property;
import com.radius.property.suggestion.pojo.Requirement;

public class DataQueryService 
{
	public List<Property> getRelevantData(Requirement pRequirement)
	{
		List<Property> lPropertyList = new ArrayList<>();
		
		//QUery database to get data whose distance is less than 10 miles
		//Fetch first 100 data.
		//This data set should satisfy all the requirements of problem statement
		//like budget +/-10% , bathroom +/-2 etc.
		
		return lPropertyList;
	}
}
