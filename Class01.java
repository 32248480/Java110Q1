package aaa;
class Cal_area
{
	private static double PI;
	private double r;
	private double length;
	private double width;
	private double high;
}
public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		double r = 10;
		double volume1 = 4 / 3 * PI * r * r * r;
		System.out.println("球形體積是:" + volume1);
		
		double length = 4;
		double width = 5;
		double high = 6;
		double volume2 = length * width * 2 + length * high * 2 + width * high * 2;
		System.out.println("立方體表面積是:" + volume2);
	}

}
