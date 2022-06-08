/**
 * 22 April 2022
 * Purpose: computes data for objects and indicates type of solid object
 *
 */

public class SolidObject {
	// sets box field
	private BoundingBox box;
	// sets type field
	private String type;

	// passes type and box
	public SolidObject(String type) {
		this.type = type;
		this.box = new BoundingBox();
	}
	// passses length width and height to box
	public SolidObject(String type, double length, double width, double height){
		this.type = type;
		this.box = new BoundingBox(length,width,height);
	}

	public SolidObject(SolidObject obj) {
		this.type = obj.type;
		this.box = new BoundingBox(obj.box);
	}
	// gets type and returns it
	public String getType() {
		return type;
	}
	// gets copy of  boundingboxfield and returns it
	public BoundingBox getBoundingBox() {
		return box;
	}
	// returns string format
	@Override
	public String toString() {
		return String.format( "%s %s", this.type, this.box,this.getVolume() , this.getSurfaceArea());

	}
	// returns equals method if objects are identical if not runs everything and then returns true
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		SolidObject otherobject =(SolidObject)obj;
		if(!this.box.equals(otherobject.box) ) {
			return false;
		}
		if(!this.type.equals(otherobject.type) ) {
			return false;
		}

		return true;
	}


	// gets volume and returns by -1.0
	public double getVolume() {

		return -1.0;
	}
	// gets surface area and returns by -1.0
	public double getSurfaceArea() {
		return -1.0;
	}
}
