import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class LektionNioExerciseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		ArrayList<Integer> firstArray = new ArrayList<Integer>();
		ArrayList<Integer> secondArray = new ArrayList<Integer>();
		
		Random randomNumber = new Random();
		
		do {
			firstArray.add(randomNumber.nextInt(21 -1 ) +1);
			i++;
		}
		while (i < 10);
		System.out.println(firstArray.toString());
		
		
		do {
			secondArray.add(randomNumber.nextInt(42 - 21) +21);
			j++;
		}
		while (j < 10 );
		System.out.println(secondArray.toString());
		
	
		ArrayList<Integer> mergedArray = new ArrayList<Integer>(20);
		
		for(int z = 0; z < secondArray.size(); z++) {
			
			mergedArray.add(firstArray.get(z));
			mergedArray.add(secondArray.get(z));
		}
		
			System.out.print(mergedArray);
			
		
		
		
		
			
		
	}

}
