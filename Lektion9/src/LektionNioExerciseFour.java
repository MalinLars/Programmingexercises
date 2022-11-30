import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class LektionNioExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 21;
		int i = 0;
		
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		Random myRandom = new Random();
		
		while (i < 10) {
			i++;
			myArray.add(myRandom.nextInt(max - min) + min);
		}
		
		System.out.println(myArray.toString());
		
		if (myArray.contains(5)) {

			if (Collections.frequency(myArray, 5) > 1) {
				System.out.println("The number 5 is in the array. Number 5 occurs " + Collections.frequency (myArray,5)+ " times.");
			}
			
			else {
				System.out.println("The number 5 is in the array. Number 5 occurs " + Collections.frequency (myArray,5)+ " time.");
				
			}
		}

		
		else{
			System.out.println("The number 5 is not in the array");
		}

	}

	private static Collection<?> myArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
