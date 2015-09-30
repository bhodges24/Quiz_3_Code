package MainPackage;

public class Triangle extends GeometricObject {
	//Create private attributes for the sides of the Triangle
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	//Create getter for "side1"
	public double getSide1() {
		return side1;
	}
	//Create setter for "side1"
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	//Create getter for "side2"
	public double getSide2() {
		return side2;
	}
	//Create setter for "side2"
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	//Create getter for "side3"
	public double getSide3() {
		return side3;
	}
	//Create setter for "side3"
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//Create a no-arg constructor
	public Triangle(){
	}
	
	//Create a Constructor that specifies side1, side2, side3 
	public Triangle(double my_side1, double my_side2, double my_side3){
		this.side1 = my_side1;
		this.side2 = my_side2;
		this.side3 = my_side3;
	}
	
	//Create "getPerimeter" method
	public double getPerimeter(){
		//Calculate Perimeter
		double Perimeter = (side1 + side2 + side3);
		
		//Return Perimeter
		return Perimeter;
	}
	
	//Create "getArea" method
	public double getArea(){
		//Set Variables
		double a = side1;
		double b = side2;
		double c = side3;
		double s  = getPerimeter()/2;
		
		//Calculate Area using Heron's Formula
		double Area  = Math.sqrt(s*(s - a)*(s - b)*(s - c));
		
		//Return Area
		return Area;
	}
	
	//Create "toString" method
	public String toString(){
		return "This is a Triangle with sides" + side1 + " "
				+ side2 + " " + side3 + ".";
	}
	
	//END OF CLASS
}
