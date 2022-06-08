/**
 * 22 April 2022
 * Purpose:computes data for block
 *
 */

public class Block extends SolidObject {

	public Block() {
		super("Block");
	}
	// passes block and double length, width, and height to super class
	public Block(double length, double width, double height) {
		super("Block",length,width, height);
	}
	// passes object parameter to super class
	public Block(Block obj) {
		super(obj);
	}
	// gets volume and computes volume of a block
	public double getVolume() {
		double x = this.getBoundingBox().getLength();
		double y = this.getBoundingBox().getWidth();
		double z = this.getBoundingBox().getHeight();
		double volume = x * y * z;
		return volume;
	}
	// gets surface area and computes area of block
	public double getSurfaceArea() {
		double x = this.getBoundingBox().getLength();
		double y = this.getBoundingBox().getWidth();
		double z = this.getBoundingBox().getHeight();
		double surfaceArea = 2 * x * y + 2 * x * z + 2 * y * z ;
		return surfaceArea;
	}


}
