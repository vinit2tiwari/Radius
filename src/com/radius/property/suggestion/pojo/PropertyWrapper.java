package com.radius.property.suggestion.pojo;

public class PropertyWrapper implements Comparable<PropertyWrapper> 
{
	private Property mProperty;
	
	private int match;
	
	private String id;

	@Override
	public int compareTo(PropertyWrapper o) 
	{
		if(match < o.match)
			return -1;
		
		return 1;
	}

	public Property getmProperty() {
		return mProperty;
	}

	public void setmProperty(Property mProperty) {
		this.mProperty = mProperty;
	}

	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
