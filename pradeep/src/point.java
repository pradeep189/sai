class Rectangle
{
	point1 origin;
	int width;
	int height;
	public int area(int x,int y)
	{
		return x*y;
		
	}
	public void move(int x,int y)
	{
		this.origin.xcoordinate=x;
		this.origin.ycoordinate=y;
		System.out.println("object moved to x,y");
		
	}
}
 class point1 {
int xcoordinate;
int ycoordinate;
}
 
public class  point
{
	public static void main(String args[])
	{
		point1 o1=new point1();
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("width of rect1:"+r1.width);
		System.out.println("height of rect1"+r1.height);
		System.out.println("area of rect1"+r1.area(2,4));
		r2.origin=o1;
		System.out.println("x position of r2"+r2.origin.xcoordinate);
		System.out.println("y position of r2 "+r2.origin.ycoordinate);
		r2.move(4, 7);
		System.out.println("x position of r2"+r2.origin.xcoordinate);
		System.out.println("y position of r2"+r2.origin.ycoordinate);
	}

}
