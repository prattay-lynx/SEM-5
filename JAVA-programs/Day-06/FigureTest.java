// Question:
// 	Create a class TwoDFigure that contains data member to represent dimensions 
// 	and a method getArea() to calculate the corresponding areas

// Output
// 	Area of Rectangle = 200.00
// 	Area of Triangle = 100.200																																																																																																																																																																																																																																																																																							

abstract class TwoDFigure{
	double dimension1, dimension2;
	abstract double getArea();

	TwoDFigure(double d1, double d2){
		dimension1=d1; dimension2=d2;
	}
}	

class Rectangle extends TwoDFigure{
	Rectangle(double h, double w){
		super(h,w);
	}
	double getArea(){
		return (super.dimension1*super.dimension2);
	}
}

class Triangle extends TwoDFigure{
	Triangle(double height, double base){
		super(height, base);
	}
	double getArea(){
		double height = super.dimension1;
		double base = super.dimension2;
		double half = (double)1/2;
		return (half*height*base);
	}
}

public class FigureTest{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,22);
		Triangle tri = new Triangle(11,22);
		System.out.printf("Area of Rectangle = %,.2f\n",rect.getArea());
		System.out.printf("Area of Triangle = %,.2f",tri.getArea());
	}
}