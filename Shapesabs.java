import java.util.*;
abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shapes{
	void  numberOfSides()
	{
		System.out.println("Number of Sides in Rectangle = 4");
	} }
class Triangle extends Shapes{
	void  numberOfSides()
	{
		System.out.println("Number of Sides in Triangle =3 ");
	}}
class Hexagon extends Shapes{
	void  numberOfSides()
	{
		System.out.println("Number of Sides in Hexagon =6");
	}}
class Shapesabs{
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Hexagon h=new Hexagon();
		h.numberOfSides();
		t.numberOfSides();
		r.numberOfSides();
	}}
