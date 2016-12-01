package polymorphism;

public class House {
	
	public int areaOfLand(int l, int h){
		
		int totalArea= l*h;
		return totalArea;
		
	}
	
	public int areaOfLand(int l, int h,int w ){
		int total = l+h+w;
		return total;
	}

}
