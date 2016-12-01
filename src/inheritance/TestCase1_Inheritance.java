package inheritance;

public class TestCase1_Inheritance {

	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.activities();
		
		Toddler toddler = new Toddler();
		toddler.canTalk();
		
		Boy boy = new Boy();
		boy.sChool();

	}

}
