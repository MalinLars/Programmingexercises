import java.util.Random;
public class LektionÅttaMyOwnRandomSignature {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;
		int y = 16;
		
		LektionÅttaMyOwnRandomSignature myObject = new LektionÅttaMyOwnRandomSignature();
		myObject.getRandomBetweenNumbers(x,y);
		
		for(int i = 0; i<10; i++) {
			System.out.println("Your random number is: " +myObject.getRandomBetweenNumbers(x, y));
		}
	
	}
	
	public int getRandomBetweenNumbers(int minValue, int maxValue) {
			
		Random random = new Random();
		return random.nextInt(maxValue - minValue) + minValue;
		
	
		
		
		
		
	}

}
