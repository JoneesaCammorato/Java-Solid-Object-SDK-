/**
 * Joneesa Cammorato
 * Cps141- Spring 2022
 * 22 April 2022
 * Instructor: Adam Divelbiss
 * Assignment : Program09
 * Purpose: computes length, width, and height and computes data for box that holds objects 
 * @author joneesacammorato
 *
 */

public class BoundingBox {
	// length width and height fields
	private double length;

	private double width;

	private double height;



	public BoundingBox() {
		length = 0;
		width = 0;
		height = 0;
	}
	// sets length width and height
	public BoundingBox(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	// passes box
	public BoundingBox(BoundingBox box) {
		this(box.length, box.width, box.height);
	}
	//gets length
	public double getLength() {
		return length;
	}
	// sets length
	public  void setLength(double length) {
		if(length>=0.0) {
			length=this.length;
		} else {
			length = 0;
		}
	}
	// gets width
	public double getWidth() {
		return width;
	}
	// sets width
	public void setWidth(double width) {
		width = Math.max(0.0, width);
	}
	// gets height and returns it
	public double getHeight() {
		return height;
	}
	// sets height
	public void  setHeight(double height) {
		this.height = height;
	}
	// compares objects if they are equal it returns true if not runs trough others and returns true
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		BoundingBox otherbox =(BoundingBox)obj;
		if(this.length != otherbox.length) {
			return false;
		}
		if(this.width != otherbox.width) {
			return false;
		}
		if(this.height != otherbox.height) {
			return false;
		}
		return true;
	}

	//returns string format output
	@Override
	public String toString() {
		String output = "";
		output +="{";
		output += String.format("l%3.0f, w %2.0f h%1.0f", length, width, height);
		output+="]";
		return output;
	}
}
