import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;

public class LektionSju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Övning 1
		//Skanna in ett namn från användaren.Använd .length för att räkna bokstäverna och skriv ut
		Scanner yourName = new Scanner(System.in);
		
		System.out.println("Please write your name");
		String name = yourName.nextLine();
		
		System.out.println("Your name is: " +name.length()+ " letters long"); */
		
		/*Övning 2  och 3
		//Ange ett antal strängar: Jämför dem med equalsmetoder. Utskriften blir true eller false
		

		String str1 = "Tjillevippen";
		String str2 = "Tjillevippen";
		String str3 = "Tjillevipp";
		String str4 = "tjillevipp";
		
		System.out.println(str1 == str2); 
		System.out.println(str1 ==str3);
		System.out.println(str2.equals(str1));
		System.out.println(str3.equalsIgnoreCase(str4));*/
		
		/* övning 4 och 5
		
		String yourWord = "Rafael";
		String yourWord2 = "Language";
		
		System.out.println("Your word ends with \"fael\": " + yourWord.endsWith("fael"));
		System.out.println ("Your word ends with \"fael\": "+ yourWord2.endsWith("fael"));
		
		System.out.println("Your word starts with \"Ra\": " + yourWord.startsWith("Ra"));
		System.out.println("Your word starts with \"Ra\": " + yourWord2.startsWith("Ra"));
		
		System.out.println("Your word starts with \"la\": " + yourWord2.startsWith("la"));
		System.out.println("Your word starts with \"La\": " + yourWord2.startsWith("La"));
		*/
		
		/*
		 * Hur man skapar och skriver ut en random int. Siffran kan vara max 10
		
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		System.out.println("Your random number is: " + randomNumber);*/
		
		/* Övning 6
		 
		Random random = new Random();
		for (int i = 0; i<10; i++) {
			System.out.println("Random loop "+i+ "=" +random.nextInt(10));*/
		
		/*Övning 7
		
		Random random = new Random();
		int sum = 0;
		int average = 0;
		int randomNumber = 0;
		
		for (int i = 0; i<10; i++) {
			randomNumber = random.nextInt(10);
			System.out.println("Random number: " +randomNumber);
			sum += randomNumber;
		}
		
		average = sum / 10;
		System.out.println(sum);
		System.out.println(average);*/
		
		/*Övning 8
		double firstValue = 10.0;
		double dividedValue = firstValue / 0.84;
		System.out.println(firstValue + " divided with 0.84 is: " +dividedValue);
		System.out.println(firstValue + " divided with 0.84 and rounded is: " +Math.round(dividedValue));
		System.out.println(firstValue + " divided with 0.84 and rounded is: " +Math.floor(dividedValue));
		System.out.println(firstValue + " divided with 0.84 and rounded is: " +Math.ceil(dividedValue)); */
		
		
		/*Övning 9
		 int exponent = 3;
		System.out.println(pow(2,exponent));*/
		
		/*Övning 10
		 * Skapa variabel för radie. Arean är PI gånger radie upphöjt till 2
		
		double radius = 4;
		double area = (PI * pow(radius, 2));
		System.out.println(area);*/
		
		
		/*int array [] = new int [30];
		Random randomNumber = new Random();
		int count = 0;
		
		
			for(int i = 0; i < 30; i++) {		//loop for adding random values to the array
				array[i] = randomNumber.nextInt(10);
			}
			
			for(int i = 0; i < array.length; i++) { //loop for printing values in array
				System.out.println(array[i]);
				
			}
			
			for (int i = 0; i < array.length; i++) { //loop for finding number five in array
				if(array[i] == 5) {
					count ++;						//add one to count every time a five is found
				}
			}
				System.out.println("Total occurances of the number 5 is: " +count);*/
		
		/*Övning 12 
		 
		Random randomBool = new Random();
		
		boolean array [] = new boolean[10];
		int countTrue = 0;
		int countFalse = 0;
		
		for (int i = 0; i < 10; i++) {
			array[i] = randomBool.nextBoolean();
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				countTrue++;
			}
			else {
				countFalse++;
			}
		}
		
		System.out.println(countTrue+ " persons belive it's true");
		System.out.println(countFalse+ " persons belive it's a hoax");*/
		
		/* Övning 14 och 15
		
		Scanner newScanner = new Scanner (System.in);
		System.out.println("Add your degree:" );
		double degree = newScanner.nextDouble();
			System.out.println(toRadians(degree));
		
		System.out.println("Add your radians: ");
		double radians = newScanner.nextDouble();
			System.out.println(toDegrees(radians));*/
		
		/*Övning 16
		Random random = new Random();
		int ageUser1 = random.nextInt(51);
		int ageUser2 = random.nextInt(51);
		
		if (ageUser1 == ageUser2){
			System.out.println("User 1 and user 2 are the same age");
		}
		
		else {
			System.out.println(max(ageUser1, ageUser2));
		}
		System.out.println("One" +ageUser1);
		System.out.println("two" +ageUser2);*/
		
		
			
		
		
		
			
	
		
			
			
		
		
		
				
		
	}

}
