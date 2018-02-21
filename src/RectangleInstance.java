import java.util.Scanner;
public class RectangleInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=3; i++){
			
		System.out.println("What is the length and width of the first rectangle? ");
		double length=scan.nextDouble();
		double width=scan.nextDouble();
		Rectangle rectangle1=new Rectangle(length,width);
		System.out.println(rectangle1.Area()+" is Area for rectangle "+i);
		System.out.println(rectangle1.Perimeter()+" is Perimeter for rectangle "+i);
		}
	}

}
