import java.util.Arrays;
import java.util.Random;
public class LektionNioExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] firstArray = new int [10];
		int [] secondArray = new int [10];
		int max = 20;
		int min = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = random.nextInt(max - min)+min;//random numbers can be between max and min value
			System.out.println(firstArray[i]); //to see array and compare with sorted and printed
			
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = random.nextInt(max - min)+min; 
			System.out.println(secondArray[i]); //to see array and compare with sorted and printed
		}
		
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		Arrays.sort(secondArray);
		System.out.println(Arrays.toString(secondArray));

	}

}
 