import java.util.Random;
import java.util.Scanner;
public class LektionFyra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Övning 1
		int a = 10;
		int b = 20;
		System.out.println("Värdena är: " +a+ " och " +b+ ".");
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Värdena är: " +a+ " och " +b+ ".");*/
		
		
		/* Övning 2		 
		
		Random rand = new Random();
		int randomInt = rand.nextInt(10000);
		System.out.println("Det slumpmässiga talet är " +randomInt);
		
		double sek = (randomInt * 2.64);
		System.out.println(+randomInt+ " BRL blir " +sek+ " i SEK");*/
		
		/* Övning 3
		Random rand = new Random();
		 
		int a = rand.nextInt(20);
		int b = rand.nextInt(20);
		
		System.out.println("+: " + a + b);
		System.out.println("-: " + (a - b));
		System.out.println("*: " + a * b);
		System.out.println("/: " + a / b);
		System.out.println("Divide by zero: "+ a / 0);*/
		
		/* Övning 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Ange dagens temperatur i celsius:");
		double celsius = sc.nextDouble();
		
		Double fahrenheit = (celsius * 1.8 + 32);
		
		System.out.println("Temperaturen i Fahrenheit är : " + fahrenheit + " F");*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hur mycket kostar varan?");
		double item = sc.nextDouble();
		
		double discount = (item * 0.13);
		System.out.println("Efter rabatten kostar varan " + (item - discount) + " kr");
		

	}

}
