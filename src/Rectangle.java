
public class Rectangle {
	double length, width;
	public Rectangle(double length1, double width1)
	{
		length=length1;
		width=width1;
	}
	public double Area()
	{
		double Area=(length*width);
		return Area;
	}
	public double Perimeter()
	{
		double Perimeter=((2*length)+(2*width));
		return Perimeter;
	}
}
