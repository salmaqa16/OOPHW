package polymorphism;

public class TestCase1_Polymorphism {

	public static void main(String[] args) {
		House house = new House();
		int SizeOfLand = house.areaOfLand(35, 50);
		System.out.println("Total Area of Land is: "+ SizeOfLand);
		 int SizeOfLand2 = house.areaOfLand(20, 60, 30);
		 System.out.println("Total Area of Land #2 is: "+ SizeOfLand2);
		 
		 Apartment apt = new Apartment();
		 apt.areaOfLand();

	}

}
