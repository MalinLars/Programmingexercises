import java.util.Random;
import java.util.ArrayList;

public class LektionNioExerciseThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1; //Starts with 1
		int max = 11; //Stops at 11

		ArrayList<Integer> arrayOfIntegers = new ArrayList<Integer>(); //create ArrayList
		Random random = new Random();
		for(int i = 0; i<10; i++) {
			arrayOfIntegers.add(random.nextInt(max - min)+min); //Puts random numbers in arrays
		}
		System.out.println(arrayOfIntegers.toString());
		
		if (arrayOfIntegers.indexOf(1) >= 0 && arrayOfIntegers.indexOf(1) < arrayOfIntegers.indexOf(2)) { //Needs to fulfill both conditions
			System.out.println("Number 1 is at index " +arrayOfIntegers.indexOf(1)+ " before number 2 at index " +arrayOfIntegers.indexOf(2));
		}
		else {
			System.out.println("Number 1 is not in front of number 2 in the index");
		}
		
		
	}

}
