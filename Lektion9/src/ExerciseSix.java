import java.util.ArrayList;
import java.util.Collections;
public class ExerciseSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit, \r\n"
				+ "et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges: \r\n"
				+ "constructio interrete. Propter nos enim illam, non propter eam nosmet ipsos diligimus. \r\n"
				+ "Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod \r\n"
				+ "parvo esset natura contenta. Nulla erit controversia";
		
		ArrayList<Character> arrayOfText = new ArrayList<Character>();
		
		for(int i = 0; i < text.length(); i++) { //adds everything in string text in arrayList
			arrayOfText.add(text.charAt(i));
			}
		 

		System.out.println("Number of A's are: " +Collections.frequency(arrayOfText, 'A'));
		System.out.println("Number of a's are: " +Collections.frequency(arrayOfText, 'a'));
		System.out.println("Number of E's are: " +Collections.frequency(arrayOfText, 'E'));
		System.out.println("Number of e's are: " +Collections.frequency(arrayOfText, 'e')); 
		System.out.println("Number of I's are: " +Collections.frequency(arrayOfText, 'I'));
		System.out.println("Number of i's are: " +Collections.frequency(arrayOfText, 'i'));
		System.out.println("Number of O's are: " +Collections.frequency(arrayOfText, 'O'));
		System.out.println("Number of o's are: " +Collections.frequency(arrayOfText, 'o'));
		System.out.println("Number of U's are: " +Collections.frequency(arrayOfText, 'U'));
		System.out.println("Number of u's are: " +Collections.frequency(arrayOfText, 'u'));
		
	
			
		

	}

}
