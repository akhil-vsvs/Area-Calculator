import java.util.Scanner;
class AreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to area calculator");
		System.out.println();
		System.out.println("Enter 1 to find area of circle.");
		System.out.println("Enter 2 to find area of triangle.");
		System.out.println("Enter 3 to find area of square.");
		System.out.println("Enter 4 to find area of rectangle.");
		System.out.println();
		System.out.println("Enter ypur choice : ");
		int a = scan.nextInt();
		if (a==1)
		{
			System.out.println("You have selected circle to find its area.");
			System.out.println();
			System.out.println("Enter the radius in cm : ");
			double radius = scan.nextDouble();
			double c_area = 3.14*radius*radius;
			System.out.println("The area of circle is "+c_area+" sqcm.");
			
		}
		else if (a==2)
		{
			System.out.println("You have selected triangle to find its area.");
			System.out.println();
			System.out.println("Enter base of triangle in cm : ");
			double base = scan.nextDouble();
			System.out.println("Enter the height of the trianglein cm : ");
			double height = scan.nextDouble();
			double t_area = 0.5*base*height;
			System.out.println("The area of triangle is "+t_area+" sqcm.");

		}
		else if (a==3)
		{
			System.out.println("You have selected square to find its area.");
			System.out.println();
			System.out.println("Enter side of square in cm : ");
			double side = scan.nextDouble();
			double s_area = side*side;
			System.out.println("The area of square is "+s_area+" sqcm.");

		}
		else if (a==4)
		{
			System.out.println("You have selected rectangle to find its area.");
			System.out.println();
			System.out.println("Enter the length of rectangle in cm : ");
			double length = scan.nextDouble();
			System.out.println("Enter the breadth of the rectangle in cm : ");
			double breadth = scan.nextDouble();
			double r_area = length*breadth;
			System.out.println("The area of rectangle is "+r_area+" sqcm.");

		}
		else 
		{
			System.out.println("Enter valid details.");
		}
		System.out.println();
		System.out.println("Thank you");
	}
}
