package com.radius.property.suggestion.service;

import java.util.List;
import java.util.TreeMap;

import com.radius.property.suggestion.pojo.Property;
import com.radius.property.suggestion.pojo.PropertyWrapper;
import com.radius.property.suggestion.pojo.Requirement;

public class PropertyService 
{
	
	private DataQueryService mDataQueryService = new DataQueryService();
	
	public TreeMap<String,PropertyWrapper> getAllMatches(Requirement pRequirement)
	{
		List<Property> lPropertyList = mDataQueryService.getRelevantData(pRequirement);
		
		return getAllMatchingProperty(lPropertyList, pRequirement);
	}
	
	/**
	 * THis method will calculate match of all the property obtained from database
	 * put them in a treemap which stores data in sorted order to display relevant 
	 * matches first.
	 * @param pPropertyList
	 * @param pRequirement
	 * @return
	 */
	private TreeMap<String,PropertyWrapper> getAllMatchingProperty(List<Property> pPropertyList , Requirement pRequirement)
	{
		TreeMap<String,PropertyWrapper> lTreeMap = new TreeMap<>();
		for (Property property : pPropertyList) 
		{
			PropertyWrapper lPropertyWrapper  =new PropertyWrapper();
			int match = property.calculateMatch(pRequirement);
			lPropertyWrapper.setmProperty(property);
			lPropertyWrapper.setId(property.getId());
			lPropertyWrapper.setMatch(match);
			lTreeMap.put(property.getId(), lPropertyWrapper);
		}
		
		return lTreeMap;
	}

}
