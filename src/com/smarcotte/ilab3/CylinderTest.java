package com.smarcotte.ilab3;

import javax.swing.JOptionPane;

public class CylinderTest 
{

	public static void main(String[] args) 
	{
		// create an array of cylinders
		Cylinder[] cylinders = new Cylinder[3];
		cylinders[0] = new Cylinder(10.5f, 20.0f);
		cylinders[1] = new Cylinder(5.0f, 10.0f);
		cylinders[2] = new Cylinder(1.5f, 5.0f);
		
		// show the values
		for(short i = 0; i < cylinders.length; i++)
		{
			JOptionPane.showMessageDialog(null, "Radius #" + (i+1) + ": " + cylinders[i].getRadius() 
					+ "\nHeight #" + (i+1) + ": " + cylinders[i].getHeight() + "\nVolume #" + (i+1) + ": " + cylinders[i].volume());
		}
		
		// get new values
		for(short i = 0; i < cylinders.length; i++)
		{
			float rad = Float.parseFloat(JOptionPane.showInputDialog("Enter radius for cylinder #" + (i+1) + ": "));
			float height = Float.parseFloat(JOptionPane.showInputDialog("Enter height for cylinder #" + (i+1) + ": "));
			cylinders[i].setRadius(rad);
			cylinders[i].setHeight(height);
		}
		
		// show the new volumes
		for(short i = 0; i < cylinders.length; i++)
		{
			JOptionPane.showMessageDialog(null, "Radius #" + (i+1) + ": " + cylinders[i].getRadius() 
					+ "\nHeight #" + (i+1) + ": " + cylinders[i].getHeight() + "\nVolume #" + (i+1) + ": " + cylinders[i].volume());
		}
		
		// exit gracefully
		System.exit(0);

	}

}
