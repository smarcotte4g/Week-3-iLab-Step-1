package com.smarcotte.ilab3;

public class Cylinder 
{
	// attributes
	private float radius;
	private float height;
	
	// constructors
	public Cylinder()
	{
		radius = 0.0f;
		height = 0.0f;
	}
	
	public Cylinder(float radius, float height)
	{
		setRadius(radius);
		setHeight(height);
	}
	// behaviors
	public float volume()
	{
		return (float) (Math.pow(radius, 2.0f)* height * Math.PI);
	}
	
	// accessors and mutators
	public float getRadius()
	{
		return radius;
	}
	public float getHeight()
	{
		return height;
	}
	
	public void setRadius(float radius)
	{
		if(radius > 0.0f)
			this.radius = radius;
		else
			this.radius = 0.0f;
	}
	
	public void setHeight(float height)
	{
		if(height > 0.0f)
			this.height = height;
		else
			this.height = 0.0f;
	}
	
}
