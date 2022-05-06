/**
 * Joneesa Cammorato
 * Cps141- Spring 2022
 * 22 April 2022
 * Instructor: Adam Divelbiss
 * Assignment : Program09
 * Purpose: computes data for sphere
 * @author joneesacammorato
 *
 */

public class Sphere extends SolidObject {

	public Sphere()	{
		super("Sphere" );
	}
	//passes sphere and radius to superclass
	public Sphere(double radius) {
		super("Sphere", radius, radius, radius);

	}
	// passes object parameter too super class
	public Sphere(Sphere obj) {
		super(obj);
	}

	public double getRadius() {
		double x = this.getBoundingBox().getLength();
		double y = this.getBoundingBox().getWidth();
		double z = this.getBoundingBox().getHeight();
		double diameter = x;
		if(y< diameter) {
			diameter = y;
		}
		if (z< diameter) {
			diameter = z ;
		}
		double radius = diameter /  2;
		return radius;
	}
	// gets volume and computes volume of sphere
	public double getVolume() {
		double r =this.getRadius();
		double pi= Math.PI ;
		double volume = (4/3)* pi *  Math.pow(r, 3);
		return volume;
	}
	// gets surface area and computes area of a sphere
	public double getSurfaceArea() {
		double r =this.getRadius();
		double pi= Math.PI ;
		double surfaceArea = 4 * pi *  Math.pow(r, 2);
		return surfaceArea;
	}

}
